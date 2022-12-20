package String;
import java.util.ArrayList;
public class Collection2 {

	public static void main(String[] args) 
	{
		ArrayList<Object>ob=new ArrayList<Object>();
		ob.add(new Car("TATA","Black",500000d));
		ob.add(new Car("Maruti","white",650000d));
		ob.add(new Bus("grey",8,true));
		ob.add(new Bus("brown",12,false));
		
		ArrayList<Object>s1=new ArrayList<Object>();
		s1.add("India");
		s1.add('P');
		for(Object b:ob)
		{
			System.out.println(b);
		}
	}

}