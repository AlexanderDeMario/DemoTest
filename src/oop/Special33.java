package oop;
import java.util.Scanner;
public class Special33
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st digit");
		int a=sc.nextInt();
		System.out.println("enter the 2nd digit");
		int b=sc.nextInt();
		System.out.println("enter the 3rd digit");
		int c=sc.nextInt();
		int z= biggestNo(a,b,c);
	    System.out.println(z + "is the largest number");
	  
	}
	
		static int biggestNo(int a,int b,int c)
		{
		if(a>b && a>c)
			return a;
		else if (b>c && b>a)
			return b;
		else
				return c;
	}
}
