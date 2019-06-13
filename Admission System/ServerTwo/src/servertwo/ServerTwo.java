
package servertwo;

import java.io.*; 
import java.text.*; 
import java.util.*; 
import java.net.*;
import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author ac
 */
public class ServerTwo {

    
    
        
        static int registrationNumber=20190000; //registration number is set initially
        static int admitCardRoll=2590; //admitcard roll number is set initially

	public static void main(String[] args) throws IOException 
	{ 

		int p;
		// server is listening on port 5056 
		ServerSocket ss = new ServerSocket(6000);
                p = ss.getLocalPort();
                System.out.println(p);
                
                
		
		
		// client request 
		if(p == 6000)
                {
                    
                    while (true) 
                    { 
			Socket s = null; //a socket object is created
			
			try
			{ 
				// socket object to receive incoming client requests 
				s = ss.accept(); //socket object accept the request of client
				
				System.out.println("A new client is connected in : " + s); 
				
				// obtaining input and out streams 
				DataInputStream dis = new DataInputStream(s.getInputStream()); 
				DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 
				
				System.out.println("Assigning new thread for this client"); 

				//Registration Number and admit card number is being increased for next applicant

				registrationNumber = registrationNumber+1; 
                                admitCardRoll = admitCardRoll+1;
                                int reg = registrationNumber;
                                
                                //Creating object of seat plan
                                SeatPlan seat = new SeatPlan(reg);
                                String allocatedSeat = seat.allocateSeat();
				// create a new thread object 
				Thread t = new ClientHandler(s, dis, dos,registrationNumber,admitCardRoll,allocatedSeat); 

                                System.out.println("Invoked 1");
				// Invoking the start() method 
				t.start();
                                System.out.println("Invoked 1");
				
			} 
			catch (Exception e){ 
				s.close(); 
				e.printStackTrace(); 
			}
                        
                    }
                    
                    
                }
                
	}
    
    
}
