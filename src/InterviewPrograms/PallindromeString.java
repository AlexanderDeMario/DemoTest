package InterviewPrograms;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String rev="";
		char a[]=s.toCharArray();
		for(int i=a.length-1; i>=0;i--)
		{
			rev=rev+a[i];
		}
		if(rev.equals(s))
			System.out.println("The give string is pallindrome");
		else
			System.out.println("The give string is not a pallindrome");
	}

}
