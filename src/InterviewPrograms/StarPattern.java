package InterviewPrograms;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int x=sc.nextInt();
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<=i;j++) 
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}