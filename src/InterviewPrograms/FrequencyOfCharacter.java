package InterviewPrograms;

import java.util.Scanner;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		int count[]=new int[148];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]>0)
			{
				System.out.println((char)i +"------------->" + count[i]);
			}
		}
	}
}
