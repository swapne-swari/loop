package logic;
import java.util.Scanner;
public class Array2D_SumPrincipleDiagonalElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int a[][]=new int [10][10];

		int row,col,i,j,sum,sum1=0,sum2=0;



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
				if(i==j)
				{
					sum1=sum1+a[i][j];
				}

				if(a[i][j]==a[i][col-i-1])

				{
					sum2=sum2+a[i][j];
				}
			}
		}
		//Print sum
		sum=sum1+sum2;
              System.out.print( "Sum of principle Diagonal and other diagonal element of array is  " + sum);			

             

	}

}
