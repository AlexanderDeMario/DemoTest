package InterviewPrograms;

public class SwappingFirstAndLastWord {

	public static void main(String[] args) {
		String s="hello";
		char[]ch=s.toCharArray();
		char temp=0;
		temp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;
		//s=new String(ch);
		System.out.println(ch);
	}
}
