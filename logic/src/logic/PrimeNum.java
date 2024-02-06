package logic;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int i,j,count=0,flag=0;
		for(i=2;i<n;i++)
		{
			flag=0;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
					}
				
			}
			if(flag==0)
			{
				System.out.println(i+"prime number");
				count++;
			}
		}
		System.out.println(count);

	}

}
