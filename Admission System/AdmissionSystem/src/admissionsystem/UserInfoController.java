
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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 
 */
public class UserInfoController implements Initializable {

    @FXML
    private TextField fullNameTextField;
    @FXML
    private Label fullNameLabel;
    @FXML
    private TextField contactNoTextField;
    @FXML
    private Label contactNoLabel;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField birthTextField;
    @FXML
    private Button registerButton;
    private String fullName;
    private String contactNo;
    private String email;
    private String birthDate;
    
    //private Student student;
    private String unit;
    @FXML
    private Label userInfoTextField;
    @FXML
    private MenuButton unitMenu;
    @FXML
    private AnchorPane basePane;

    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void unitAOnAction(ActionEvent event) {
        
        this.unit = "Unit A";
        
    }

    @FXML
    private void unitBOnAction(ActionEvent event) {
        
        this.unit = "Unit B";
        
    }

    @FXML
    private void unitCOnAction(ActionEvent event) {
        
        this.unit = "Unit C";
        
    }

    @FXML
    private void unitDOnAction(ActionEvent event) {
        
        this.unit = "Unit D";
    }

    @FXML
    private void unitIBAOnAction(ActionEvent event) {
        
        this.unit = "Unit IBA";
        
    }

    //register Button Action
    @FXML
    private void registerButtonOnAction(ActionEvent event) throws IOException {
        
        int flag1 = 1;
        int flag2 = 1;
        
        this.fullName = this.fullNameTextField.getText();
        
        //Checking Validity of students Name
        try{
            
            for (int i=0; i < this.fullName.length(); i++){
                       
                       if(this.fullName.charAt(i)>=48 && this.fullName.charAt(i)<=57){
                           
                           flag1 = 0;
                           throw new Exception();
                           
                       }
                      
            }
            
        }catch(Exception e){
            
            flag1 = 0;
            this.fullNameLabel.setText("Name isn't correct");
            
        }
        
        this.contactNo = this.contactNoTextField.getText();
        
        ////Checking Validity of contact No
        try{
            
            if(this.contactNo.length() != 11){
                
                flag2 = 0;
                throw new Exception();
                
            }
        }catch(Exception e){
            
            flag2 = 0;
            this.contactNoLabel.setText("Invalid Contact No");
            
        }
        
        this.email = this.emailTextField.getText();
        this.birthDate = this.birthTextField.getText();
        
        
        
        Student student = new Student();
        
        if (flag1 == 1 && flag2 == 1){
            
            student.setName(this.fullName);
            student.setContactNo(this.contactNo);
            student.setEmail(this.email);
            student.setBirthDate(this.birthDate);
            student.setUnit(this.unit);
            
            this.connect(student);
            
            student.storeInFile();
            
            File file = new File("AdmitCardRoll.txt");
            if(!file.exists()){
            
                file.createNewFile();
            
            }
            FileWriter fw1 = new FileWriter(file);
            fw1.write(student.getAdmitCardRoll());
            fw1.close();
        
            Parent root = FXMLLoader.load(getClass().getResource("AdmitCard.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            
            
        }
        
        
            
        
    }
    
    //Connect to server in a new port 6000
    public void connect(Student student) throws IOException 
    { 
		try
		{ 
			
			
			// getting localhost ip 
			InetAddress ip = InetAddress.getByName("localhost"); 
	
			// establish the connection with server port 5056 
			Socket s = new Socket(ip, 6000); 
                        
	
			// obtaining input and out streams 
			DataInputStream dis = new DataInputStream(s.getInputStream()); 
			DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 

			//Client sending information to server
                        
                        dos.writeUTF(this.fullName);
                        dos.writeUTF(this.contactNo);
                        dos.writeUTF(this.email);
                        dos.writeUTF(this.birthDate);
                        dos.writeUTF(this.unit);
                        
                        String messageFromServer;
                        
                        messageFromServer = dis.readUTF();
                        student.setRegistrationNumber(messageFromServer);
                        
                        messageFromServer = dis.readUTF();
                        student.setAdmitCardRoll(messageFromServer);
                        
                        messageFromServer = dis.readUTF();
                        student.setSeat(messageFromServer);
			               
                        System.out.println(student);
                        
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

    
    


    
}
