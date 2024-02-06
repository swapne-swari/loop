package lab;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int sign=1,limit ,count=0;
		float term;
		float num=1,den=1,sum=0;
		System.out.println("enter the number");
		limit=sc.nextInt();
		do {
			term=(num/den)*sign;
			sign=sign*(-1);
			sum=term+sum;
			den++;
			count++;	
		}while(count<=limit);
		System.out.println(term);

	}

}
