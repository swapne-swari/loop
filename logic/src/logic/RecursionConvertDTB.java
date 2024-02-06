package logic;

import java.util.Scanner;

public class RecursionConvertDTB {
	static int db(int n)
	{
		if(n==0)
			return 0;
		else
			return(n%2+10*db(n/2));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,result;
		System.out.println("enter the values of n");
		n=sc.nextInt();
		result=db(n);
		System.out.println("sum of each digit of given number :"+result);
		

	}

}
