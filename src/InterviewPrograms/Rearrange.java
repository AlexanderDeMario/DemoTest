package InterviewPrograms;

public class Rearrange {

	public static void main(String[] args) {
		String s="a1b2c3";
		String x="";
		String y="";
		char ch[]=s.toCharArray();
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i]>='a' &&ch[i]<='z')
			{
				x=x+ch[i];
			}
			else {
				y=y+ch[i];
			}
	     }
		//System.out.println(x+y);
        System.out.println(x.toString());
        System.out.println(y.toString());
	}
}

