
package admissionsystem;




import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Aminul Kader Bulbul & Md. Mehedi Hasan Riyad & Mahodi Atik Shuvo
 */
public class Student {
    
    //Attribute
    private String HSCRoll;
    private String HSCPassingYear;
    private String board;
    private String SSCRoll;
    private String name;
    private String contactNo ;
    private String email;
    private String birthDate;
    private String unit;
    private String registrationNumber;
    private String admitCardRoll;
    private String seat;
    private String fileName;
    private File file;
    private FileWriter fw;

    //Constructor
    public Student(){
        
        
        
    }
    
    //Store in files of student information 
    public void storeInFile() throws IOException{
        
        
        
        this.setFileName(this.getAdmitCardRoll() + "Name" + ".txt");
        this.setFile(new File(this.getFileName()));
        if(!this.file.exists()){
            
            this.getFile().createNewFile();
            
        }
        this.setFw(new FileWriter(getFile(), true));
        this.getFw().write(this.getName());
        this.getFw().close();
        
        this.setFileName(this.getAdmitCardRoll() + "ContactNo" + ".txt");
        this.setFile(new File(this.getFileName()));
        if(!this.file.exists()){
            
            this.getFile().createNewFile();
            
        }
        this.setFw(new FileWriter(getFile(), true));
        this.getFw().write(this.getContactNo());
        this.getFw().close();
        
        this.setFileName(this.getAdmitCardRoll() + "Email" + ".txt");
        this.setFile(new File(this.getFileName()));
        if(!this.file.exists()){
            
            this.getFile().createNewFile();
            
        }
        this.setFw(new FileWriter(getFile(), true));
        this.getFw().write(this.getEmail());
        this.getFw().close();
        
        this.setFileName(this.getAdmitCardRoll() + "BirthDate" + ".txt");
        this.setFile(new File(this.getFileName()));
        if(!this.file.exists()){
            
            this.getFile().createNewFile();
            
        }
        this.setFw(new FileWriter(getFile(), true));
        this.getFw().write(this.getBirthDate());
        this.getFw().close();
        
        this.setFileName(this.getAdmitCardRoll() + "Unit" + ".txt");
        this.setFile(new File(this.getFileName()));
        if(!this.file.exists()){
            
            this.getFile().createNewFile();
            
        }
        this.setFw(new FileWriter(getFile(), true));
        this.getFw().write(this.getUnit());
        this.getFw().close();
        
        
        this.setFileName(this.getAdmitCardRoll() + "Registration" + ".txt");
        this.setFile(new File(this.getFileName()));
        if(!this.file.exists()){
            
            this.getFile().createNewFile();
            
        }
        this.setFw(new FileWriter(getFile(), true));
        this.getFw().write(this.getRegistrationNumber());
        this.getFw().close();
        
        
        this.setFileName(this.getAdmitCardRoll() + "Admit" + ".txt");
        this.setFile(new File(this.getFileName()));
        if(!this.file.exists()){
            
            this.getFile().createNewFile();
            
        }
        this.setFw(new FileWriter(getFile(), true));
        this.getFw().write(this.getAdmitCardRoll());
        this.getFw().close();
        
        this.setFileName(this.getAdmitCardRoll() + "Seat" + ".txt");
        this.setFile(new File(this.getFileName()));
        if(!this.file.exists()){
            
            this.getFile().createNewFile();
            
        }
        this.setFw(new FileWriter(getFile(), true));
        this.getFw().write(this.getSeat());
        this.getFw().close();
        
        
        
        
    }

    /**
     * @return the HSCRoll
     */
    public String getHSCRoll() {
        return HSCRoll;
    }

    /**
     * @param HSCRoll the HSCRoll to set
     */
    public void setHSCRoll(String HSCRoll) {
        this.HSCRoll = HSCRoll;
    }

    /**
     * @return the HSCPassingYear
     */
    public String getHSCPassingYear() {
        return HSCPassingYear;
    }

    /**
     * @param HSCPassingYear the HSCPassingYear to set
     */
    public void setHSCPassingYear(String HSCPassingYear) {
        this.HSCPassingYear = HSCPassingYear;
    }

    /**
     * @return the board
     */
    public String getBoard() {
        return board;
    }

    /**
     * @param board the board to set
     */
    public void setBoard(String board) {
        this.board = board;
    }

    /**
     * @return the SSCRoll
     */
    public String getSSCRoll() {
        return SSCRoll;
    }

    /**
     * @param SSCRoll the SSCRoll to set
     */
    public void setSSCRoll(String SSCRoll) {
        this.SSCRoll = SSCRoll;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return the registrationNumber
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * @param registrationNumber the registrationNumber to set
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * @return the admitCardRoll
     */
    public String getAdmitCardRoll() {
        return admitCardRoll;
    }

    /**
     * @param admitCardRoll the admitCardRoll to set
     */
    public void setAdmitCardRoll(String admitCardRoll) {
        this.admitCardRoll = admitCardRoll;
    }

    /**
     * @return the seat
     */
    public String getSeat() {
        return seat;
    }

    /**
     * @param seat the seat to set
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the file
     */
    public File getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * @return the fw
     */
    public FileWriter getFw() {
        return fw;
    }

    /**
     * @param fw the fw to set
     */
    public void setFw(FileWriter fw) {
        this.fw = fw;
    }

    
    


}

