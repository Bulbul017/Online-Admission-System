
package server;

/**
 *
 * @author ac
 */


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Aminul Kader Bulbul, Md. Mehedi Hasan Riyad, Mahodi atik Shuvo
 */

public class StudentWithServer {

    
    
    
   
    private String HSCRoll;
    private String HSCPassingYear;
    private String board;
    private String SSCRoll;
    private String registrationNumber;
    private String admitCardRoll;
    
    


    StudentWithServer() {
        
    }
    
    //Checking the validity of HSC roll
    public int hscRollCheck() throws IOException{
        
        String fileName = this.getHSCRoll() + ".txt";
        File file = new File(fileName);
        if(!file.exists()){
            
              file.createNewFile();
              return 0;
            
        }
        else return 1;
        
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


