package logic;

import java.util.Scanner;

public class DuplicateRemoveAaary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int  a[]=new int[20];
		int  b[]=new int[20];
		int n,i,j = 0,temp=0;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the array element");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		j=0;
		for(i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
				b[j++]=a[i];
		}
		b[j++]=a[n-1];
		for(i=0;i<j;i++)
			System.out.println(b[i]);

	}

}
