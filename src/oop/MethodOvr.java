package oop;

public class MethodOvr
{
	int phy=67;
	int chem=78;
	int maths=56;
	static 
	{
		System.out.println("Students performance");
		System.out.println("__________________________________________");
	}
	void total()
	{
		int d=phy+chem+maths;
		System.out.println("the total marks are "+ d);
	}
	void perc()
	{
		int t=(phy+chem+maths)/4;
		System.out.println("the total percentage is "+ t);
	}
	public static void main(String[]args)
	{
		MethodOvr s=new MethodOvr();
		s.total();
		s.perc();
	}
}
	