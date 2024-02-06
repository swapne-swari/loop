package logic;

import java.util.Scanner;

public class Arraylarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a[]=new int[50];
		int n,i,j,large;
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
		System.out.println("largest is "+large);
		
	}

}
