package oop;
import java.util.Scanner;
public class Factorial
{

	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number");
     int n=sc.nextInt();
     int f=getFact(n);
     System.out.println("factorial of the given number is " +f);
	}
	static int getFact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
