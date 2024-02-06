 package logic;

import java.util.*;

public class quickSort {
	static void quicksort(int a[],int lower,int upper)
	{
		int i;
		
		if(upper>lower)
		{
			i=Split(a,lower,upper);
			quicksort(a,lower,i-1);
			quicksort(a,i+1,upper);
			
			
		}
	}
	static int Split(int a[],int lower,int upper) 
	{
		int i,p,q,t;
		p=lower+1;
		q=upper;
		i=a[lower];
		while(p>=q)
		{
			while(a[p]<i)
				p++;
			while(a[q]>i)
				q--;
			if(q>p) {
				t=a[p];
				a[p]=a[q];
				a[q]=t;
			}
		}
		t=a[lower];
		a[lower]=a[q];
		a[q]=t;
		
		
		return q;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int j,i;
		System.out.println("enter the size of array");
		j=sc.nextInt();
		System.out.println("enter the array element");
		for(i=0;i<j;i++)
			a[i]=sc.nextInt();
		quicksort(a,0,j-1);
		for(i=0;i<j;i++)
			System.out.println(a[i]);
	}

}
