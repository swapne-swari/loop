package logic;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a[]=new int[50];
		int i,j,n,min,pos,p;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the array element");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			min=a[i];
			pos=i;
			for(j=i+1;j<n;j++)
			{
				if(a[j]<min)
				{
					min=a[j];
					pos=j;
				}
			}
			a[pos]=a[i];
			a[i]=min;
			for(p=0;p<n;p++)
				System.out.println(a[p]);
			System.out.println();
		}
		
		for(i=0;i<n;i++)
			System.out.println(a[i]);

	}

}
