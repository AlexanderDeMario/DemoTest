package InterviewPrograms;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		char a[]=s .toCharArray();
		String rev ="";
		for (int i = a.length-1; i>=0; i--) {
			 rev = rev+a[i];	
		}
		System.out.println(rev);
	}
}