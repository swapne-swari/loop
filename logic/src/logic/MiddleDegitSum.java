package logic;

import java.util.Scanner;

public class MiddleDegitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a[]=new int[50];
		int n,i,sum=0;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the array element");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("array elements are ");
		for(i=1;i<n-1;i++)
			sum=sum+a[i];
		System.out.println("sum"+sum);




	}

}
