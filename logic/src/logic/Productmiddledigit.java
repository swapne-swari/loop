package logic;

import java.util.Scanner;

public class Productmiddledigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=376826;
		int t = 0,r,i,sum=0;
		while(n>0)
		{
			n=n/10;
			r=n%10;	
			sum=sum+r;
		}
		
		while(n>10)
		{
			t=n/10;
		}
		sum=sum-t;
		System.out.println(sum);
	}

}
