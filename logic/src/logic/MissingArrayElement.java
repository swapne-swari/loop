package logic;

import java.util.Scanner;

public class MissingArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a[]=new int[50];
		int n,i,x;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the array element");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		x=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]-i!=x)
			{
				while(x<a[i]-1)
				{
					System.out.print(x+i+" ");
					x++;
				}
			}
		}
		
		

	}

}
