package logic;
import java.util.Scanner;
public class Array2D_SparceMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int a[][]=new int [10][10];

		int row,col,i,j,count=0;

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

				if(a[i][j]==0)

				{

					count++;

					

				}

				

			}

		}

		if(count>(row*col)/2)

		{

			System.out.println("It is a Sparce Matrix");

		}

		else {

			System.out.println("It is  not a Sparce Matrix");



		}



	}

}
