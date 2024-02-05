/*
 
  while(Boolean_expression) {
   // Statements
}
---------------------------------------
*/



package loop;
import java.util.Scanner;
public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int i=sc.nextInt();
		while(i<1 || i>10 )
		{
			System.out.println(i+" is not between 1 to 10 .try again");
			i=sc.nextInt();
			
		}
		System.out.println(i+ " is between 1 to 10");
		

	}

}
