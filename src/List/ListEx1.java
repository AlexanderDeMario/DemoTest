package List;
import java.util.ArrayList;
public class ListEx1 {

	public static void main(String[] args) 
	{
		ArrayList<Object>al=new ArrayList<Object>();
		al.add("Chotu");
		al.add(20);
		al.add('B');
       
       ArrayList<Object>bl=new ArrayList<Object>(al);
			  bl.add(28);
			  bl.add("try");
			 System.out.println(bl);
	}

}
