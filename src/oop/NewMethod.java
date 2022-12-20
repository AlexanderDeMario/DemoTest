package oop;

public class NewMethod {

	public static void main(String[] args) 
	{
		int x=200;
		boolean b=check(x);
		System.out.println("the give number is "+ b);
		
	}
	public static boolean check(int x)
	{
	if (x%2==0)
		return true;
	else
		return false;


}
}
