package logic;

import java.util.Scanner;

public class RecursionGcd {
	static int gcd(int n1,int n2)
	{
		if(n1==0)
			return n2;
		if(n2==0)
			return n1;
		if(n1>n2)
			return gcd(n1%n2,n2);
		else
			return gcd(n1,n2%n1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1,n2,result;
		System.out.println("enter the values of n");
		n1=sc.nextInt();
		n2=sc.nextInt();
		result=gcd(n1,n2);
		System.out.println("gcd of given number :"+result);
		

	}

}
