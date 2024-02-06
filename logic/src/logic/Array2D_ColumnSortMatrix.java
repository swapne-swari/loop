package logic;
import java.util.Scanner;
public class Array2D_ColumnSortMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int a[][]=new int [10][10];

		int row,col,i,j,k,temp;



		

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

		

		//Logic for Sorting

		for(j=0;j<col;j++)

		{

			for(i=0;i<row;i++)

			{

				for(k=i+1;k<row;k++)

				{

					if(a[i][j]>a[k][j])

					{

						temp=a[i][j];

						a[i][j]=a[k][j];

						a[k][j]=temp;

					}

				}

			}

		}

	

		//Print matrix



				for(i=0;i<row;i++)

				{

					for(j=0;j<col;j++)

					{

		              System.out.print(a[i][j] + "  ");			

		              }

					System.out.println();

				}

			



	}

}
