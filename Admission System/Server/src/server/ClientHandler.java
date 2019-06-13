
package server;

import java.io.*; 
import java.text.*; 
import java.util.*; 
import java.net.*; 

// ClientHandler class 
class ClientHandler extends Thread 
{ 
	
	final DataInputStream dis; 
	final DataOutputStream dos; 
	final Socket s; 
	
	private String HSCroll;
        private String HSCyear;
        private String board;
        private String SSCroll;
        

	// Constructor 
	public ClientHandler(Socket s, DataInputStream dis, DataOutputStream dos) 
	{ 
		this.s = s; 
		this.dis = dis; 
		this.dos = dos;
		

	} 

	@Override
	public void run() 
	{ 
		String received; 
		String toreturn;
                
                
		try { 

				StudentWithServer student = new StudentWithServer();
                    
                                //Getting information from client
                                
                                
                                
                                received = dis.readUTF();
                                student.setHSCRoll(received);
                                
                                received = dis.readUTF();
                                student.setHSCPassingYear(received);
                
                                received = dis.readUTF();
                                student.setBoard(received);
                
                                received = dis.readUTF();
                                student.setSSCRoll(received);
                                
                                System.out.println(student);
                           
                                //dos.writeUTF("New");
                                if(student.hscRollCheck()==0){
                                    
                                    dos.writeUTF("New");
                                    
                                   
                                }
                                else if(student.hscRollCheck()==1){
                                    
                                    dos.writeUTF("Old");
                                    
                                   
                                }
                                
                                    
                                 
                                //student.StoreInFile(registrationNumber, admitCardRoll);
                                
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
				

					

				
				
				
			} catch (IOException e) { 
				e.printStackTrace(); 
			}
                        
		 
		
		
	} 
} 


