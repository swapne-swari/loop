package logic;
import java.util.Scanner;
public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib1=0,fib2=1,fib3,count=0;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		
		System.out.println(fib1+"/t"+fib2);
		do {
			fib3=fib1+fib2;
			System.out.println(fib3);
			fib1=fib2;
			fib2=fib3;
			count++;
			
		}while(count<limit);
		
		

	}

}
