package InterviewPrograms;

import java.util.HashMap;
import java.util.Set;

public class CountOfDuplicatesInTheSententence {

	public static void main(String[] args) {
		String s="Today's day was wasted completely because of mock. As today's weather was very nice we would have sleptin the room and enoyed the day";
		s=s.replaceAll(" ", "");
		s=s.replaceAll("'", "");
		s=s.replace(".", "");
		s=s.toUpperCase();
		System.out.println(s);
		String[]x=s.split("");
		
		HashMap<String,Integer> hs=new HashMap<>();
		
		for (String ss : x) {
			if(hs.containsKey(ss))
			{
				hs.put(ss, hs.get(ss)+1);
			}
			else
			{
				hs.put(ss, 1);
			}
		}
		Set<String> w = hs.keySet();
		for (String w1 : w) {
			if(hs.get(w1)>0)
				System.out.println(w1+"====>"+hs.get(w1));
		}

	}

}
