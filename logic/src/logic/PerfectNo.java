package logic;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  num number");
		 num= sc.nextInt();
		 for(int i=1;i<num;i++)
		 {
			 if(num%i==0)
				 sum=sum+i;
		 }
		 if (sum==num)
			 System.out.println("perfect number");
		 else
			 System.out.println("not perfect number");

	}

}
