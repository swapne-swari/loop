package lab;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=0;i<=5;i++)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(" ");
				
			}
			for(j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
