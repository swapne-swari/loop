package logic;

import java.util.Scanner;

public class LeadrerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int  a[]=new int[10];
		int i,n,j ;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		
		System.out.println("enter the array element");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]<=a[j])
					break;
			}
			
			if(j==n)
				System.out.println(a[i]);
		}
		

	}

}
