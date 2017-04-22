package socketest;

import java.io.DataInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
				Socket clientSocket =new Socket ("127.0.0.1",9000);
				OutputStream output =clientSocket.getOutputStream();
				DataInputStream input=new DataInputStream(clientSocket.getInputStream());
				
				int c;
				String response;
				while (( c= System.in.read())!=-1){
					output.write((int)c);
					if(c=='\n'){
						output.flush();
						response=input.readLine();
						System.out.println(response);				
					}
				}
				output.close();
				input.close();
				clientSocket.close();
		} catch (Exception e){
				System.err.println("Exception :"+e);
		}
	}
}
