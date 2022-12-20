package InterviewPrograms;

import java.util.Scanner;

public class NumberPallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		String s=sc.nextLine();
		String rev="";
		for (int i =s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);	
		}
		if(rev.equals(s))
		{
			System.out.println("is a pallindrome");
		}
		else {
			System.out.println("is not a pallindrome");
		}
	}

}
