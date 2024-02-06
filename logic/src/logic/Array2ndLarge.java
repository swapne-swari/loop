package logic;

import java.util.Scanner;

public class Array2ndLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a[]=new int[50];
		int n,i,j,large,large1;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		
		System.out.println("enter the array element");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		large=a[0];
		for(i=1;i<n;i++)
		{
			if(a[i]>large)
				large=a[i];
		}
		large1=-1;
		for(i=1;i<n;i++)
		{
			if(a[i]>large1 && a[i]!=large)
				large1=a[i];
		}
		System.out.println(" 1st largest is "+large);
		System.out.println(" 2nd largest is "+large1);
		

	}

}
