package oop;
import java.util.Scanner;
public class SumSquare
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sq=sumOfSquare(n);
		System.out.println("sum of square of individual digits is " + sq);
		
	}
	static int sumOfSquare(int n)
	{
		int sum=0;
		do
		{
			int d=n%10;
			sum=sum+(d*d);
			n=n/10;
		}
		while(n!=0);
		return sum;
	}

}
