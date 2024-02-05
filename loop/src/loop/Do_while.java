/*
 
 do {
   // Statements
}while(Boolean_expression);

------------------------------
 */


package loop;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int i;
		do {
			System.out.println("enter the number between 1 to 10");			
			i=sc.nextInt();
		}while(i<1 || i>10);
		System.out.println(i+ " is between 1 to 10");
		

	}

}
