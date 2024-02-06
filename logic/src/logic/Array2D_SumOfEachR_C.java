package logic;
import java.util.Scanner;
public class Array2D_SumOfEachR_C {

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

			int  rowsum=0;

			for(j=0;j<col;j++)

			{

				rowsum=rowsum+a[i][j];

			}

			System.out.println(rowsum);

		} 

		for(i=0;i<row;i++)

		{

			int  colsum=0;

			for(j=0;j<col;j++)

			{

				colsum=colsum+a[i][j];

			}

			System.out.println(colsum);

			//Isme Col ka sum baraber nahi print ho raha

		}

	}

}
