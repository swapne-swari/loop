package logic;

import java.util.Scanner;

public class ArrayReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int  a[]=new int[20];
		int n,i;
		
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the array element");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("enter your source element");
		int source_element=sc.nextInt();
		System.out.println("enter your replace element");
		int replace_element=sc.nextInt();
		for(i=0;i<n;i++)
			if(a[i]==source_element)
				{
				a[i]=replace_element;
				break;
				}
		
	
		for(i=0;i<n;i++)
		System.out.println(a[i]);
		

	}

}
