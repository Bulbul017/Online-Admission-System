
package admissionsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Aminul Kader Bulbul & Md. Mehedi Hasan Riyad & Mahodi Atik Shuvo
 */
public class AdmitCardController implements Initializable {

    @FXML
    private TextField admissionRollTextField;
    @FXML
    private TextField registrationTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField contactNoTextField;
    @FXML
    private TextField unitTextField;
    @FXML
    private Button downloadButton;
    @FXML
    private Button previewButton;
    
    private String readFromFile;
    private String readFromFile2;
    private String fileName;
    private File file;
    private FileWriter fw;
    private Scanner sc;
    @FXML
    private TextField seatTextField;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void downloadButtonOnAction(ActionEvent event) {
    }

    //Preview button action 
    @FXML
    private void previewButtonOnAction(ActionEvent event) throws IOException {
        
        //Reading the admit roll of the student from file AdmitCardRoll.txt
        this.file = new File("AdmitCardRoll.txt");
        if(!this.file.exists()){
            
            this.file.createNewFile();
            
        }
        this.sc = new Scanner(this.file);
        this.readFromFile = sc.nextLine();
        
        //Getting information of the student from files
        this.fileName = this.readFromFile + "Name" + ".txt";
        this.file = new File(fileName);
        if(!this.file.exists()){
            
            this.file.createNewFile();
            
        }
        this.sc = new Scanner(this.file);
        this.readFromFile2 = sc.nextLine();
        this.nameTextField.setText(this.readFromFile2);
        
        this.fileName = this.readFromFile + "ContactNo" + ".txt";
        this.file = new File(fileName);
        if(!this.file.exists()){
            
            this.file.createNewFile();
            
        }
        this.sc = new Scanner(this.file);
        this.readFromFile2 = sc.nextLine();
        this.contactNoTextField.setText(this.readFromFile2);
        
        this.fileName = this.readFromFile + "Email" + ".txt";
        this.file = new File(fileName);
        if(!this.file.exists()){
            
            this.file.createNewFile();
            
        }
        this.sc = new Scanner(this.file);
        this.readFromFile2 = sc.nextLine();
        this.emailTextField.setText(this.readFromFile2);
        
        this.fileName = this.readFromFile + "Unit" + ".txt";
        this.file = new File(fileName);
        if(!this.file.exists()){
            
            this.file.createNewFile();
            
        }
        this.sc = new Scanner(this.file);
        this.readFromFile2 = sc.nextLine();
        this.unitTextField.setText(this.readFromFile2);
        
        this.fileName = this.readFromFile + "Registration" + ".txt";
        this.file = new File(fileName);
        if(!this.file.exists()){
            
            this.file.createNewFile();
            
        }
        this.sc = new Scanner(this.file);
        this.readFromFile2 = sc.nextLine();
        this.registrationTextField.setText(this.readFromFile2);
        
        this.fileName = this.readFromFile + "Admit" + ".txt";
        this.file = new File(fileName);
        if(!this.file.exists()){
            
            this.file.createNewFile();
            
        }
        this.sc = new Scanner(this.file);
        this.readFromFile2 = sc.nextLine();
        this.admissionRollTextField.setText(this.readFromFile2);
        
        
        this.fileName = this.readFromFile + "Seat" + ".txt";
        this.file = new File(fileName);
        if(!this.file.exists()){
            
            this.file.createNewFile();
            
        }
        this.sc = new Scanner(this.file);
        this.readFromFile2 = sc.nextLine();
        this.seatTextField.setText(this.readFromFile2);
        
        
    }
    
}
