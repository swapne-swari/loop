package logic;

import java.util.Scanner;

public class SumOfEach {
		static int sum(int n)
	{
		if(n==0)
			return 0;
		else
			return(n%10+sum(n/10));			


	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,result;
		System.out.println("enter the values of a");
		n=sc.nextInt();
		result=sum(n);
		System.out.println("sum of each digit of given number :"+result);
	}

}
