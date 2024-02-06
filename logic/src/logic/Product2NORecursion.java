package logic;
import java.util.Scanner;
public class Product2NORecursion {
	static int product(int x,int y)
	{
		if(x==1)
			return y;
		else
			return(y+product(x-1,y));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,result;
		System.out.println("enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		result=product(a,b);
		System.out.println("product of two number "+result);
		
		
		

	}

} 
