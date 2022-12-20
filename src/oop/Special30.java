package oop;
import java.util.Scanner;
public class Special30 
{
 static int sumOfSqDigits(int n)
 {
	 int sum=0;
	 while(n!=0)
	 {
		 int d=n%10;
		 sum=sum+(d*d);
		 n = n/10;
	 }
	 return sum;
 }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sm = sumOfSqDigits(n);
		System.out.println("the sum of square of "+ n+ "is "+ sm);

	}

}
