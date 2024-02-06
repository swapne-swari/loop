package logic;
import java.util.*;
public class Array2D_EvenOddCountMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int a[][]=new int [10][10];

		int row,col,i,j,evencount=0,oddcount=0;



		

		System.out.println("Enter the Order of array");

		row=sc.nextInt();

		col=sc.nextInt();

		

		System.out.println("enter the two dimentional Array Element");

		for(i=0;i<row;i++)

		{

			for(j=0;j<col;j++)

			{

				a[i][j]=sc.nextInt();

			}

		}



		for(i=0;i<row;i++)

		{

			for(j=0;j<col;j++)

			{

				if(a[i][j]%2==0)

				{

					evencount++ ;

				}

				else

				{

					oddcount++;

				}

				

            }

		}

		System.out.println("Even count is "+evencount);

		System.out.println("Odd count is "+oddcount);



		

	}

}
