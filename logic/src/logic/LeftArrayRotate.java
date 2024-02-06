package logic;

import java.util.Scanner;

public class LeftArrayRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int  a[]=new int[20];
		int n,i,j;
		int nr,first;
		
		
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the array element");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		
		System.out.println("enter how many time do you want rotate");
		nr=sc.nextInt();
		
		for(i=0;i<nr;i++)
		{
			first=a[0];
			for(j=0;j<n-1;j++)
				a[j]=a[j+1];
			a[n-1]=first;	
		}
		
		for(i=0;i<n;i++)
			System.out.println(a[i]);
		

	}

}
