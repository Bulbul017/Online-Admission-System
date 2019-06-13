
package admissionsystem;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author ac
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private  Button submitButton;
    
    @FXML
    private  Label errorInHscRoll;    
    @FXML
    private  TextField hscRollTextField;  
    private String hscRoll;
    
    @FXML
    private  Label errorInSscRoll; 
    @FXML
    private  TextField sscRollTextField;
    private String sscRoll;
    
    @FXML
    private  TextField hscPassingYearTextField;
    private String hscPassingYear;
    
    private String board;
    
    @FXML
    private  TextField serverTextField;
    private String serverAdress;
    @FXML
    private Tab ar;
    @FXML
    private TextField checkAdmitCardRoll;
    @FXML
    private Label ipAddressLabel;
    
    
    
    //Submit button action
    @FXML
    private void submitButtonOnAction(ActionEvent event)throws Exception {
        
        
        
        int flag1 = 1; //initialization
        int flag2 = 1; //initialization
        
        
        this.hscRoll = this.hscRollTextField.getText();
        
        System.out.println(this.hscRoll);
        
        //Checking validity of hsc roll
        try{
            
            this.errorInHscRoll.setText("") ;
            
            for (int i=0; i < this.hscRoll.length(); i++){
                
                //if invalid      
                if(this.hscRoll.charAt(i)<48 && this.hscRoll.charAt(i)>57){
                           
                           
                          flag1 = 0; 
                          throw new Exception();
                          
                          
                }
                      
            }
            
            this.errorInHscRoll.setText("") ;
            
        }catch(Exception e){
            
            flag1 = 0;
            //Showing the invalid message
            this.errorInHscRoll.setText("HSC Roll isn't correct") ;
            
        }
        try{
            
            if(this.hscRoll.length()!=6){
                 
                flag1 = 0;
                throw new Exception();
                       
            }
            
        }catch(Exception e){
            
            flag1 = 0;
            this.errorInHscRoll.setText("HSC Roll isn't correct") ;
            
        }
        
        this.sscRoll = this.sscRollTextField.getText();
        System.out.println(this.sscRoll);
        
        //Checking validity of hsc roll
        try{
            
            this.errorInSscRoll.setText("") ;
            
            for (int i=0; i < this.sscRoll.length(); i++){
                       
                if(this.sscRoll.charAt(i)<48 && this.sscRoll.charAt(i)>57){
                           
                           
                          flag2 = 0;
                          throw new Exception();
                          
                          
                }
                      
            }
            
            this.errorInSscRoll.setText("") ;
            
        }catch(Exception e){
              
              flag2 = 0;
              //showing error message
              this.errorInSscRoll.setText("SSC Roll isn't correct") ;
            
        }
        try{
            
            if(this.sscRoll.length()!=6){
                
                flag2 = 0;
                throw new Exception();
                       
            }
            
        }catch(Exception e){
            
            flag2 = 0;
            this.errorInSscRoll.setText("SSC Roll isn't correct") ;
            
        }
        
        this.hscPassingYear = this.hscPassingYearTextField.getText();
        System.out.println(this.hscPassingYear);
        System.out.println(this.board);
        
        this.serverAdress = this.serverTextField.getText();
        System.out.println(this.serverAdress);
        
        //If valid then create student object
        if (flag1 == 1  &&  flag2 == 1){
            
            
            System.out.println("All is well");
            
            Student student = new Student();
            student.setHSCRoll(this.hscRoll);
            student.setHSCPassingYear(this.hscPassingYear);
            student.setSSCRoll(this.sscRoll);
            student.setBoard(this.board);
            
            
            System.out.println(student);
            
            //connect to server
            this.connect();
            
            
            System.out.println("I have come out of cliet class");
             
             
             
             
                            
            
        }
        
    }
    
    @FXML
    private void barisalBoardAction(ActionEvent event)throws Exception{
        
        this.board = "Barisal";
        
    }
    
    @FXML
    private void dinajpurBoardAction(ActionEvent event)throws Exception{
        
        this.board = "Dinajpur";
        
    }
    
    @FXML
    private void dhakaBoardAction(ActionEvent event)throws Exception{
        
        this.board = "Dhaka";
        
    }
    
    @FXML
    private void rajshahiBoardAction(ActionEvent event)throws Exception{
        
        this.board = "Rajshahi";
        
    }
    
    @FXML
    private void jessoreBoardAction(ActionEvent event)throws Exception{
        
        this.board = "Jessore";
        
    }
    
    @FXML
    private void sylhetBoardAction(ActionEvent event)throws Exception{
        
        this.board = "Sylhet";
        
    }
    
    @FXML
    private void chittagongBoardAction(ActionEvent event)throws Exception{
        
        this.board = "Chittagong";
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    //To connect with the server
    public void connect() throws IOException 
    { 
		try
		{ 
			
			
			
                        InetAddress ip = InetAddress.getByName("localhost"); 
			// establish the connection with server port 5056 
			//Socket s = new Socket(this.serverAdress, 5056); 
                        Socket s = new Socket(ip, 5056); 
	
			// obtaining input and out streams 
			DataInputStream dis = new DataInputStream(s.getInputStream()); 
			DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 

			//Client sending information to server
			               
                            
                         
			dos.writeUTF(this.hscRoll);
                        dos.writeUTF(this.hscPassingYear);
                        dos.writeUTF(this.board);
                        dos.writeUTF(this.sscRoll);
                            
                        System.out.println("Just sent.....");
                        
                        String messageFromServer;
                        messageFromServer = dis.readUTF();
                        
                        if(messageFromServer.equals("New")){
                            
                            System.out.println("New Student");
                            Parent root = FXMLLoader.load(getClass().getResource("UserInfo.fxml"));
                            Scene scene = new Scene(root);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.show();
                       
                        }
                        else if(messageFromServer.equals("Old")){
                            
                            System.out.println("Old Student");
                            Parent root = FXMLLoader.load(getClass().getResource("AlreadyRegistered.fxml"));
                            Scene scene = new Scene(root);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.show();
                       
                        }
                        
            
                            
            
	
			
			// closing resources 
                        
			dos.writeUTF("Exit");
                        s.close();
                        System.out.println("Connection closed"); 
			dis.close(); 
			dos.close();
                        
                        
		}catch(Exception e){ 
			e.printStackTrace(); 
		}
                
                
    }

    @FXML
    private void checkSubmitOnAction(ActionEvent event) throws IOException {
        
        File file = new File("AdmitCardRoll.txt");
        if(!file.exists()){
            
            file.createNewFile();
            
        } 
        FileWriter fw1 = new FileWriter(file);
        fw1.write(this.checkAdmitCardRoll.getText());
        fw1.close();
        
        Parent root = FXMLLoader.load(getClass().getResource("AdmitCard.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
    }

    
    
}
