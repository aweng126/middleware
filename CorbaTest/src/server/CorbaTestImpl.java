package server;

import CorbaTest.GoldbashPOA;

public class CorbaTestImpl extends GoldbashPOA {

	public String checkNum(float a) {
		
		
		for(int j=2;j<(a/2+1);j++){
			if(isPrimeNum(j)&&isPrimeNum(a-j)){
				return "the number is "+(j-0.0)+" and "+(a-j);
			}
		}
        return "2332";
		
/*		for(int i=2;i<(a/2+1);i++){
			System.out.println(i);
			if(isPrimeNum(i)&&isPrimeNum(a-i)){
				return "两个质数分别是"+(i-0.0)+" 和 "+(a-i);
			}
		}
		return ""+2333333;*/
	
	}
	
	
	  public Boolean isPrimeNum(float num){
			
			for(int i=2;i<(num/2+1);i++){
				if(num%i==0){
				  return false;
				}
			}
			return true;
		}
}
