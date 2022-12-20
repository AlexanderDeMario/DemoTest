package List;

import java.util.HashSet;
import java.util.Iterator;

public class ListEx4
{
	public static void main(String[] args) 
	{
	HashSet<Object>h=new HashSet<Object>();
	h.add(21);
	h.add(true);
	h.add("rahul");
	
	for(Object p:h)
		System.out.println(p);
	
	Iterator<Object>i=h.iterator();
	
	while(i.hasNext()==true)
	{
		System.out.println(i.next());
	}
	}
}



