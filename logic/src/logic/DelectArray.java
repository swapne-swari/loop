package logic;

import java.util.Scanner;

public class DelectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int  a[]=new int[20];
		int i;
		System.out.println("enter the size of array a");
		int n=sc.nextInt();
		for( i=0;i<n;i++)
		{
			System.out.println("insert array element");
			a[i]=sc.nextInt();
		}
		System.out.println("enter the location what you delect");
		int position=sc.nextInt();
		for(i =position-1;i<n-1;i++)
		{
			a[i]=a[i+1];
		}
		
		n--;
	
	for(i=0;i<n;i++)
		System.out.println(a[i]);
	

	}

}
