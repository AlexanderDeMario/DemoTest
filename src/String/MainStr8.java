package String;
import java.util.Scanner;
public class MainStr8
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		int wc=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
				wc++;
		}
		System.out.println("Number of words are "+ wc);
	}
}
