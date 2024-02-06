package logic;

import java.util.Scanner;

public class ReverseNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int rem;
		int tem=n;
		int rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		if(rev==tem)

			System.out.println("palindom");
		else
			System.out.println("not same");
	}

}
