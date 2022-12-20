package oop;
import java.util.Scanner;
public class Special35 
{

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the integer value");
	int n=sc.nextInt();
	boolean pr=primeNo(n);
	if (pr==true)
	System.out.println(n + "is a prime number");
	else
		System.out.println(n + "is not a prime number");
	}
 static boolean primeNo(int n)
 {
	 for( int i=2; i<=n/2; i++)
	 {
		 if(n%i==0)
			 return false;
	 }
	 return true;
	 
 }
}
