package List;

import java.util.Set;
import java.util.TreeMap;

public class ListEx7 {

	public static void main(String[] args)
	{
		TreeMap<Integer,Object>t=new TreeMap <Integer,Object>();
		t.put(3,"Rahul");
		t.put(1,9102308815l);
		t.put(4,924587l);
		t.put(2,"BTM");
		Set s=t.entrySet();
		for(Object i:s)
		System.out.println(i);

		
	}

}
