import java.net.*;
import java.io.IOException;
  
  public class MyServer02 {
  	
   	
  	
  	public static void main (String[] args) {
  		ServerSocket servSock = null;
  		Socket clientSock = null;
  
  		try {
  			
  			servSock = new ServerSocket(6000, 30);
  
  			while (true) {
  			
  				clientSock = servSock.accept();
  				System.out.println("受付ました");
  
  			
  				InetAddress iaClient = clientSock.getInetAddress();
      		
  				String ipClient = iaClient.toString();
  				System.out.println("IP: "+ipClient);
  			}
  		} catch (IOException e) {
  			System.err.println("error");
  			System.exit(1);
  		}
  	}
  }