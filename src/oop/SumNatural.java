package oop;
import java.util.Scanner;
public class SumNatural 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(System.in);
		int n=sc.nextInt();
		int sm=sumNatural1(n);
		System.out.println("sum of the natural number is "  + sm);

	}
	static int sumNatural1(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		return sum;
	}

}
