package List;

import java.util.LinkedList;

public class ListEx3 {

	public static void main(String[] args) 
	{
		LinkedList<Object>ll=new LinkedList<Object>();
		ll.add(210);
		ll.add("tiger");
		ll.add('r');
		ll.add(1,25);
		System.out.println(ll);
		System.out.println(ll.get(1));
		System.out.println(ll.indexOf("tiger"));	
		
	}

}
