package List;

import java.util.TreeSet;

public class ListEx5 {

	public static void main(String[] args)
	{
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(28);
		t.add(1);
		t.add(23);
		t.add(98);
		System.out.println(t);
		for(Integer i:t)
			System.out.println(i);
		
		
	}

}
