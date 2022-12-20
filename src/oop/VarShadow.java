package oop;

public class VarShadow
{
	static int a=16;
	void display()
	{
		int a=2500;
		System.out.println(a);
		
	}

	public static void main(String[] args)
	{
	 String a="BTM";
	 
	VarShadow ob=new VarShadow();
	ob.display();
	System.out.println(VarShadow.a);
	System.out.println(a);
	
	}

}
