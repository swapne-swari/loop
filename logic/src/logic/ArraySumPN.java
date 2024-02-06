package logic;

import java.util.Scanner;

public class ArraySumPN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a[]=new int[50];
		int n,i,sum=0,sum1=0;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the array element");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("array elements are ");
		for(i=0;i<n;i++)
			if(a[i]>=0)
				sum=sum+a[i];
			else
				sum1=sum1+a[i];
		
		System.out.println("sum of positive no. :"+sum);
		System.out.println("sum of nagetive no. :"+sum1);

	}

}
