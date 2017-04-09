package rmitest;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GoldbachDefineImp extends UnicastRemoteObject implements GoldbachDefine {



   public GoldbachDefineImp() throws RemoteException {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	public String checkNum(int num) throws RemoteException {
		// TODO Auto-generated method stub
		
//		具体的实现逻辑代码
		
		for(int i=2;i<(num/2+1);i++){
			if(isPrimeNum(i)&&isPrimeNum(num-i)){
				return "这两个数字为"+i+"和"+(num-i);
			}
		}
		return 2333333+"";
	}
	
	public Boolean isPrimeNum(int num){
		
		for(int i=2;i<(num/2+1);i++){
			if(num%i==0){
			  return false;
			}
		}
		return true;
	}
	
}
