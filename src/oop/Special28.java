package oop;
import java.util.Scanner;
public class Special28 
{
 static int getFact(int n)	
{
	int fact=1;
	while(n>1)
	{
		fact=fact*n;
		n--;
	}
	return fact;
}
 
	public static void main(String[]args) 
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n= sc.nextInt();
		int f= getFact(n);
		System.out.println("factorial of " + n + " is  " +f);

	}

}
