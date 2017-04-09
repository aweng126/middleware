package rmitest;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GoldbachClient {

	public static void main(String args[])throws MalformedURLException,RemoteException,NotBoundException{	
		//在RMI注册表中查找指定对象
		GoldbachDefine goldbach =  (GoldbachDefine) Naming.lookup("rmi://localhost:8888/Goldbach");
        //调用远程对象方法
        System.out.println("client:");
        System.out.println(goldbach.checkNum(8));
		
	}
}
