package logic;

import java.util.Scanner;

public class TwoDiamArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a[][]=new int[10][10];
		int row,col,i,j;
		System.out.println("enter the order of array a");
		row=sc.nextInt();
		col=sc.nextInt();
		System.out.println("enter the two diamentional array element");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("two diamentional array element");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" /t ");
			}
			System.out.println();
		}
		

	}

}
