package rmitest;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GoldbachDefine extends Remote{
	public String checkNum(int num) throws RemoteException;
	

}
