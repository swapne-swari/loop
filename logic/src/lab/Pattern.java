package lab;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=0;i<=5;i++)
		
			for(j=i;j<=5;j++)
			{
				System.out.print(" ");
				
			}
			for(j=i;j<5;j++)
			{
				System.out.print(j);
			}
			for(j=2;j<=i;j++)
				System.out.print(j);
			System.out.println();
		}

	}


