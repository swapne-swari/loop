package logic;

import java.util.Scanner;

public class Recursion_Reverse {
	static void reverse(int n)
	{
		if(n>0)
		{
			System.out.print(n%10);
			reverse(n/10);
		}
			
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the values of a");
		n=sc.nextInt();
		reverse(n);
		

	}

}
