package String;
import java.util.*;

public class ArrrayList 
{
	public static void main(String []args)
	{
		ArrayList<Object>ob=new ArrayList<Object>();
		ob.add(100);
		ob.add(true);
		ob.add("java");
		ob.add('P');
		ob.add("BTM");
		Iterator<Object> i=ob.iterator();
		while(i.hasNext()==true)
		{
			System.out.println(i.next());
		}
	}
}
