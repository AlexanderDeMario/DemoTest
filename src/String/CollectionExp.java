package String;
import java.util.ArrayList;
public class CollectionExp {

	public static void main(String[] args) 
	{
		ArrayList<Object>al=new ArrayList<Object>();
		al.add(new Student2("Modi",789));
		al.add(new Student2("Devendra",888));
		al.add(new Employee2("Abhishek",111));
		al.add(new Employee2("Milon",222));
		al.add(new Employee2("Raj",254));
		al.add(new Person2("Obama",45));
		al.add(new Person2("Putin",51));
		ArrayList<Object>al2=new ArrayList<Object>();
		al2.add("India");
		al2.add("BTM");
		System.out.println("index of btm: "+al2.indexOf("BTM"));
		al2.addAll(1,al);
		System.out.println("index of btm: "+al2.indexOf("BTM"));
		System.out.println(al2);
		for(Object a:al)
		{
			System.out.println(a);
		}
/*System.out.println(al);*/
		/*System.out.println(al.get(8));*/
	}

}
