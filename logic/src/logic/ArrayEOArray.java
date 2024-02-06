package logic;

import java.util.Scanner;

public class ArrayEOArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int  a[]=new int[20];
		int n,i,j=0,k=0;
		int count=0,count1=0;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the array element");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
			System.out.println("array elements are ");
			for(i=0;i<n;i++)
			{
				if(a[i]%2==0)
					count++;
				else
					count1++;
			}
			
			
			int  b[]=new int[count];
			int  c[]=new int[count1];
			for(i=0;i<n;i++)
			{
				if(a[i]%2==0)
					b[j++]=a[i];
				else
					c[k++]=a[i];
					
			}
			for(i=0;i<j;i++)
				System.out.println(b[i]);
			for(i=0;i<k;i++)
				System.out.println(c[i]);
			
			


	}

}
