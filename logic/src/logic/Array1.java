package logic;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a[]=new int[50];
		int n,i;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the array element");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("array elements are ");
		for(i=0;i<n;i++)
			System.out.println(i+"th element is "+a[i]);
			
		

	}

}
