package logic;

import java.util.Scanner;

public class InsertArray {

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
		System.out.println("enter your keyelement which you want to inserted");
		int key_element=sc.nextInt();
		System.out.println("enter the location");
		int position=sc.nextInt();
		for(i =n;i>=position;i--)
		{
			a[i]=a[i-1];
		}
			a[i]=key_element;
			n++;
		
		for(i=0;i<n;i++)
			System.out.println(a[i]);
		
		

	}

}
