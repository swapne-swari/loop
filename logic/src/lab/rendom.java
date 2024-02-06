package lab;
import java.util.Scanner;

public class rendom {

	public static void main(String[] args) {
		// TODO Auto-generated method stubb
		int randomnumber=12;
		int i=0,n;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();

		while(n>0)
		{
			if(randomnumber==n)
			{
				System.out.println("congratulation you gussed it");
				break;
			}
			else if(randomnumber>n) {
				System.out.println("too low ,try again");
				n=sc.nextInt();
				
			}
			
			else if(randomnumber<n)
			{
				System.out.println("too high ,try again");
				n=sc.nextInt();
				
		}
		}
	}

}

	