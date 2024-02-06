package logic;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int limit=sc.nextInt();
		double sum=0;
		int num=1;
		int den=1;
		int sign=1,term=0;
		int count=0;
		do
		{
			term=(num/den)*sign;
			sign=sign*(-1);
			sum=sum+term;
			den++;
			count++;
		}while(count<limit);

		System.out.println(sum);
	}

}
