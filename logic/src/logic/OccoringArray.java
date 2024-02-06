package logic;

import java.util.Scanner;

public class OccoringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int  a[]=new int[20];
		int n,i,j,count=0,max_occ=0;
		
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the array element");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			count=0;
			for(j=0;j<n;j++)
			{
				if(a[i]==a[j])
					count++;
			}
			if(count>max_occ)
			{
				max_occ=count;
				max_occ=a[i];
			}
			
		}
		System.out.println("maximum occurence element of array "+max_occ);

	}

}
