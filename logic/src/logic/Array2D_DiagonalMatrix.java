package logic;
import java.util.Scanner;
public class Array2D_DiagonalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int a[][]=new int [10][10];

		int row,col,i,j;

		boolean flag=true;

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

				if(i!=j)

				{

					if(a[i][j]!=0)

					{

						flag=false;

						break;

					}

				}

				else {

					if(a[i][j]==0)

					{

						flag=false;

						break ;

					}

				}

			}

		}

		if(flag)

		{

			System.out.println("Its is a Diagonal Matrix");

		}

		else

		{

			System.out.println("It is not a Diagonal Matrix");

		}

	



	}

}
