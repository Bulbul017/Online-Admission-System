
package servertwo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ac
 */
public class StudentWithServerTwo {
    
    private String name;
    private String contactNo ;
    private String email;
    private String birthDate;
    private String unit;
    private String registrationNumber;
    private String admitCardRoll;
    private String fileName;
    private File file;
    private FileWriter fw;
    
    public StudentWithServerTwo(){
        
        
    }
    
    public void storeInFile() throws IOException{
        
        
        
        this.fileName = this.admitCardRoll + "Name" + ".txt";
        this.file = new File(this.fileName);
        if(!this.file.exists()){
            
              this.file.createNewFile();
            
        }
        this.fw = new FileWriter(file,true);
        this.fw.write(this.name);
        this.fw.close();
        
        this.fileName = this.admitCardRoll + "ContactNo" + ".txt";
        this.file = new File(this.fileName);
        if(!this.file.exists()){
            
              this.file.createNewFile();
            
        }
        this.fw = new FileWriter(file,true);
        this.fw.write(this.contactNo);
        this.fw.close();
        
        this.fileName = this.admitCardRoll + "Email" + ".txt";
        this.file = new File(this.fileName);
        if(!this.file.exists()){
            
              this.file.createNewFile();
            
        }
        this.fw = new FileWriter(file,true);
        this.fw.write(this.email);
        this.fw.close();
        
        this.fileName = this.admitCardRoll + "BirthDate" + ".txt";
        this.file = new File(this.fileName);
        if(!this.file.exists()){
            
              this.file.createNewFile();
            
        }
        this.fw = new FileWriter(file,true);
        this.fw.write(this.birthDate);
        this.fw.close();
        
        this.fileName = this.admitCardRoll + "Unit" + ".txt";
        this.file = new File(this.fileName);
        if(!this.file.exists()){
            
              this.file.createNewFile();
            
        }
        this.fw = new FileWriter(file,true);
        this.fw.write(this.unit);
        this.fw.close();
        
        
        this.fileName = this.admitCardRoll + "Registration" + ".txt";
        this.file = new File(this.fileName);
        if(!this.file.exists()){
            
              this.file.createNewFile();
            
        }
        this.fw = new FileWriter(file,true);
        this.fw.write(this.registrationNumber);
        this.fw.close();
        
        
        this.fileName = this.admitCardRoll + "Admit" + ".txt";
        this.file = new File(this.fileName);
        if(!this.file.exists()){
            
              this.file.createNewFile();
            
        }
        this.fw = new FileWriter(file,true);
        this.fw.write(this.admitCardRoll);
        this.fw.close();
        
        
        
        
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

    
    
}
