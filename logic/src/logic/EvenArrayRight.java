package logic;

import java.util.Scanner;

public class EvenArrayRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int  a[]=new int[50];
		int i,n , min=0,temp;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		
		System.out.println("enter the array element");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		int max=n-1;
		min=0;
		while(min<max)
		{
			while(a[min]%2==0 && min<max)
				min++;
			while(a[max]%2==1 && min<max)
				max--;
			
			if(min<max)
			{
				temp=a[min];
				a[min]=a[max];
				a[max]=temp;
			}
			min++;
			max--;
		}
		
			for(i=0;i<n;i++)
				System.out.println(a[i]);
			
		}

	}


