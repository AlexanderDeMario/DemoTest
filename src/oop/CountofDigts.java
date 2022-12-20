package oop;
import java.util.Scanner;
public class CountofDigts
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int c=countDigits(n);
	System.out.println("number of the digits is "+ c);
	}
	static int countDigits(int n)
	{
		 int count=0;
		do
		{
			n=n/10;
		count++;
		}
		while(n!=0);
			return count;
	}

}
