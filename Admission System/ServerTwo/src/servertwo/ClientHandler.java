
package servertwo;

import java.io.*; 
import java.text.*; 
import java.util.*; 
import java.net.*; 
import java.util.logging.Level;
import java.util.logging.Logger;

// ClientHandler class 
class ClientHandler extends Thread 
{ 
	
	final DataInputStream dis; 
	final DataOutputStream dos; 
	final Socket s; 
	private int registrationNumber;
        private int admitCardRoll;
        private String name;
        private String contactNo ;
        private String email;
        private String birthDate;
        private String unit;
        private String allocatedSeat;

	// Constructor 
	public ClientHandler(Socket s, DataInputStream dis, DataOutputStream dos,int registrationNumber,int admitCardRoll,String allocatedSeat) 
	{ 
		this.s = s; 
		this.dis = dis; 
		this.dos = dos;
		this.registrationNumber = registrationNumber;
		this.admitCardRoll = admitCardRoll;
                this.allocatedSeat = allocatedSeat;

	}
        
        @Override
        public void run(){
            
            try{
                
                String received;
                StudentWithServerTwo student = new StudentWithServerTwo();
                
                received = dis.readUTF();
                student.setName(received);
                
                received = dis.readUTF();
                student.setContactNo(received);
                
                received = dis.readUTF();
                student.setEmail(received);
                
                received = dis.readUTF();
                student.setBirthDate(received);
                
                received = dis.readUTF();
                student.setUnit(received);
                
                String registrationNumber = Integer.toString(this.registrationNumber);
                student.setRegistrationNumber(registrationNumber);
                String admitCardRoll = Integer.toString(this.admitCardRoll);
                student.setAdmitCardRoll(admitCardRoll);
                dos.writeUTF(registrationNumber);
                dos.writeUTF(admitCardRoll);
                dos.writeUTF(this.allocatedSeat);
                
                System.out.println(student);
                
                student.storeInFile();
                
                received = dis.readUTF();
                
                if(received.equals("Exit")) 
                {  
                                        
                    this.s.close(); 
                    System.out.println("Connection closed"); 
                    try
                    { 
                        //close the strem
                        this.dis.close(); 
                        this.dos.close(); 
			
                    }catch(IOException e){ 
                        
                        e.printStackTrace(); 
                                        
                    }                    
                                         
                    
                }
                
            } catch (IOException ex) {
                
                ex.printStackTrace();
                
            }
        }

	
} 

