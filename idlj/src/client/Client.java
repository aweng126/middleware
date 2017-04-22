package client;

import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

import IdljTest.Goldbash;
import IdljTest.GoldbashHelper;


public class Client {
	 static Goldbash corbaTestImpl;  
     
	    static {  
	        System.out.println("client start connect to the server");   
	        
	        String args[] = new String[4];  
	        args[0] = "-ORBInitialHost";  
	   
	        args[1] = "127.0.0.1";  
	        args[2] = "-ORBInitialPort";  
	    
	        args[3] = "900";  
	           
	        ORB orb = ORB.init(args, null);  
	           

	        org.omg.CORBA.Object objRef = null;  
	        try {  
	        objRef = orb.resolve_initial_references("NameService");  
	        } catch (InvalidName e) {  
	            e.printStackTrace();  
	        }  
	        NamingContextExt neRef = NamingContextExtHelper.narrow(objRef);  
	           
	        String name = "Hello";  
	        try {  
	        	
	   
	            corbaTestImpl = GoldbashHelper.narrow(neRef.resolve_str(name));  
	        } catch (NotFound e) {  
	            e.printStackTrace();  
	        } catch (CannotProceed e) {  
	            e.printStackTrace();  
	        } catch (org.omg.CosNaming.NamingContextPackage.InvalidName e) {  
	            e.printStackTrace();  
	        } 
	   }
	        
	         
	    public static void main(String args[]) throws Exception {  
	    	 float a=8;
	    	 String str = corbaTestImpl.checkNum(a);  
		        System.out.println(str);  
	    }  
}
