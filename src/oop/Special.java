package oop;
import java.util.Scanner;
public class Special 
{
	static int sumOfDigit(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum=sum+n;
			n--;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sm=sumOfDigit(n);
		System.out.println("sum of the digit "+n+ "natural no is "+ sm);

	}

}
