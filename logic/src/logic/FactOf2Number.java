package logic;

import java.util.Scanner;

public class FactOf2Number {
		
		static int fact(int x)
		{
			if(x==0)
				return 1;
			else
				return(x*fact(x-1));
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int a,b,result;
			System.out.println("enter the values of a");
			a=sc.nextInt();
			result=fact(a);
			System.out.println("fact of number "+result);
			
			
			

	}

}
