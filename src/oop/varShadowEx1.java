package oop;

public class varShadowEx1 
{
	
	void add(int a,int b,int c)
	{
	System.out.println(a+b+c);
	}
	void add(int a,int b)
	{
	System.out.println(a+b);
	}
	void display(int a,int c)
	{
	System.out.println(a+c);
	}

	public static void main(String[] args)
	{
		varShadowEx1 ob= new varShadowEx1();
		ob.add(20,35,67);
		ob.add(52,26);
		ob.add(1,20);

	}

}
