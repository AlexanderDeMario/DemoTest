package List;

import java.util.HashMap;
import java.util.Set;

public class ListEx6 {

	public static void main(String[] args)
	{
		HashMap<String,Object> hm=new HashMap<String,Object>();
		hm.put("name","Alex");
		hm.put("place","Btm");
		hm.put("Ph no", 9102308815l);
		hm.put("pincode",831015l);
		System.out.println(hm);
		Set s=hm.entrySet();
		for(Object i:s)
			System.out.println(i);
			
	}

}
