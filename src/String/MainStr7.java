package String;

public class MainStr7 {

	public static void main(String[] args) 
	{
		String st="ABHISHEK123456";
		st=st.toLowerCase();
		int countV=0, countC=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
		
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				countV++;
			}
			else if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u')
				countC++;
			
	}
	for(int i=0;i<st.length();i++)
	{
		System.out.println(i+" "+st);
	}
		System.out.println("vowel: "+countV);
		System.out.println("cosonanat: "+countC);

}
}

