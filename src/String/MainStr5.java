package String;
import java.util.Scanner;
public class MainStr5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		int uc=0,lc=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='A' && ch<='Z')
				uc++;
				else if(ch>='a' && ch<='z')
					lc++;
		}
System.out.println("number of capital letters are "+ uc);
System.out.println("number of small letters are "+ lc);
	}

}
