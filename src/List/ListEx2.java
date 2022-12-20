package List;

import java.util.ArrayList;

public class ListEx2 {

	public static void main(String[] args) 
	{
		ArrayList<Object>al=new ArrayList<Object>();
		al.add("Rahul");
		al.add("Lund ka");
		al.add("baal h");
		al.addAll(1,al);
		System.out.println(al);
		
		ArrayList<Object>bl=new ArrayList<Object>();
		bl.add("k2");
		bl.add("madarchod");
		bl.add("h");
		
	}

}
