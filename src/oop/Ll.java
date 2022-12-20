package oop;
import java.util.*;

public class Ll
{
public static void main(String[]args)
{
	LinkedList<Integer>ll=new LinkedList<Integer>();
	ll.add(100);
	ll.add(200);
	ll.add(30);
	ll.add(15);
	
	Iterator<Integer> i=ll.iterator();
	while(i.hasNext()==true)
	{
		System.out.println(i.next());
	}
	
}
}
