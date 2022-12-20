package oop;
import java.util.Scanner;
public class Special34
{
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the integer value");
	 int n=sc.nextInt();
	 boolean sp=specialNo(n);
	 if (sp==true)
		 System.out.println(n + " is a special number");
	 else
		 System.out.println(n + " is not a special number");
	}
static boolean specialNo(int n)
{
	int d1=n/10;
	int d2=n%10;
	int sum= d1+d2+d1*d2;
	if(sum==n)
		return true;
	else
		return false;
		
}
}
