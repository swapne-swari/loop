package logic;
import java.lang.*;
public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=11,c=-11,b=15;
		System.out.println(a^b);//4   
		System.out.println(~a);//-12   -(n+1)
		System.out.println(~c);//10      (n-1)
		int d=0b1001;
		System.out.println(~d); //if  we put "ob"  start in binary number then also compiler know it is binary number.  
		
	}
}
