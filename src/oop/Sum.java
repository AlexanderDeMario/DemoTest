package oop;
import java.util.Scanner;
public class Sum
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int sm=sumOfDigits(n);
		System.out.println("sum of the digit is " + sm);
	}
	static int sumOfDigits(int n)
	{
	int sum=0;
	while(n!=0)
	{
	   int d=n%10;
	   sum=sum+d;
	   n=n/10;
	}
	return sum;
	
	}

}
