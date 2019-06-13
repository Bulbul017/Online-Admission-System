
package server;

/**
 *
 * @author Aminul Kader Bulbul, Md. Mehedi Hasan Riyad, Mahodi atik Shuvo
 */

import java.io.*; 
import java.text.*; 
import java.util.*; 
import java.net.*;
import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

// Server class 
public class Server
{

	

	public static void main(String[] args) throws IOException 
	{ 

		int p;
		// server is listening on port 5056 
		ServerSocket ss = new ServerSocket(5056);
                p = ss.getLocalPort();
                System.out.println(p);
                
                
		
		
		// client request 
		if(p == 5056)
                {
                    
                    while (true) 
                    { 
			Socket s = null; //a socket object is created
			
			try
			{ 
				// socket object to receive incoming client requests 
				s = ss.accept(); //socket object accept the request of client
				
				System.out.println("A new client is connected : " + s); 
				
				// obtaining input and out streams 
				DataInputStream dis = new DataInputStream(s.getInputStream()); 
				DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 
				
				System.out.println("Assigning new thread for this client"); 

				

				
				// create a new thread object 
				Thread t = new ClientHandler(s, dis, dos); 

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



