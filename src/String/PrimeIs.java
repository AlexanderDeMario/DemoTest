package String;

import java.util.Scanner;

public class PrimeIs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(num!=0)
		{
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		if(temp==rev)
			System.out.println("palindre");
		else
			System.out.println("not pal");

	}

}
