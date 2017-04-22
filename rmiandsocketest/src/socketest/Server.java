package socketest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.RemoteException;

public class Server {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			boolean flag=true;
			Socket client=null;
			String inputLine; 
			ServerSocket serverSocket =new ServerSocket (9000);
			System.out.println("server srart to listen port 9000");
		
			while(flag) { 
				client=serverSocket.accept();
				DataInputStream input=new DataInputStream(new BufferedInputStream(client.getInputStream())); 
				PrintStream output=new PrintStream(new BufferedOutputStream(client.getOutputStream())); 

				while (( inputLine= input.readLine())!=null) { 
					if(inputLine.equals("-1")){ 
						flag=false; 
					    break; 
					} 
					inputLine=checkNum(Integer.parseInt(inputLine));
				output.println(inputLine); 
				output.flush(); 
				} 
			
				output.close(); 
				input.close(); 
				client.close(); 
			} 
			serverSocket.close(); 
		}catch(IOException e){
			
		} 
		
	}

	private static String checkNum(int num) throws RemoteException {
		// TODO Auto-generated method stub
		
		for(int i=2;i<(num/2+1);i++){
			if(isPrimeNum(i)&&isPrimeNum(num-i)){
				return "Number1="+i+" ; Number2="+(num-i);
			}
		}
		return "not fount";
	}
	
	private static Boolean isPrimeNum(int num){
		
		for(int i=2;i<(num/2+1);i++){
			if(num%i==0){
			  return false;
			}
		}
		return true;
	}

}