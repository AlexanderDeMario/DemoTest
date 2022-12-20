package oop;
import java.util.Scanner;
public class BigSmall 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int large= getBiggest(n);
		int little=getSmallest(n);
		System.out.println("biggest number is " +large );
		System.out.println("smallest number is " + little );
	}
static int getBiggest(int n)
{
	int big=n%10;
	while(n!=0)
	{
		int d=n%10;
		if(d>big)
			big=d;
			n=n/10;
	}
	return big;
}
static int getSmallest(int n)
{
	int small=n%10;
	while(n!=0)
	{
		int d=n%10;
		if(d<small)
			small=d;
		n=n/10;
	}
	return small;
	}
}

