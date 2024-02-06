package logic;

import java.util.Scanner;

public class ArrayEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int  a[]=new int[20];
		int n,i;
		int esum=0,osum=0;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the array element");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
			System.out.println("array elements are ");
			for(i=0;i<n;i++)
				if(a[i]%2==0)
					esum=esum+a[i];
				else
					osum=osum+a[i];
			
			
		System.out.println("sum of even no. :"+esum);
		System.out.println("sum of odd no. :"+osum);
				
				
		
	}

}
