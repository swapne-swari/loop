package logic;

import java.util.Scanner;

public class ArraySearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int  a[]=new int[20];
		int n,i,flag=0;
		
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the array element");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("enter your keyelement which you want to search");
		int key_element=sc.nextInt();
		
		for(i=0;i<n;i++)
			{
			if(a[i]==key_element)
			
				{
				flag=1;
				break;
				}
			}
		
	if(flag==1)
		System.out.println("search is successful "+key_element+ " is found a["+i+']');
	else
		System.out.println("not searching "+key_element);
		
	
	

	}

}
