package logic;

import java.util.Scanner;

public class RecursionPrimeNo {
	static int primeNo(int n,int i)
	{
		if(i==1)
			return 1;
		else
		{
			if(n%i==0)
				return 0;
			else
				return primeNo(n,i-1);
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,result;
		System.out.println("enter the values of n");
		n=sc.nextInt();
		int i=n/2;
		result=primeNo(n,i);
		if(result==0)
		
			System.out.println("number is not prime number ");
		else
			System.out.println("number is  prime number ");
		

	}

}
