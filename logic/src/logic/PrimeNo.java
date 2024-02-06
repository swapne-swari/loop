package logic;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int i,j,count=0,count1=0;
		for(i=0;i<n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
				if(count==2)
					System.out.println(n+" is a prime number");
					count1++;
			
			}
			
	}
		System.out.println(count1);

	}
}