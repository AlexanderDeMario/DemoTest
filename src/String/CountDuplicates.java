package String;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CountDuplicates {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] c=str.toCharArray();
		HashMap<Character, Integer> chars=new HashMap<>();
		for (int i=0;i<c.length;i++) {
			if(chars.containsKey(c[i]))
			{
				chars.put(c[i], chars.get(c[i])+1);
			}
			else
			{
				chars.put(c[i], 1);
			}
		}
//		System.out.println(chars);
		Set<Character> ks = chars.keySet();
		System.out.println(ks);
		for (Character k : ks) {
			if(chars.get(k)>1)
			{
				System.out.println(k+"---"+chars.get(k));
			}
		}	
	}
	

}
