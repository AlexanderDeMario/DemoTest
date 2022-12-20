package oop;

public class Pen 

	
	{
	int price;
	String type;
	String colour;
	static String brand="cello";
	
	public void printDetails()
	{
		System.out.println("The price of the pen is "+ price);
		System.out.println("The type of the pen is "+ type);
		System.out.println("The colour of the pen is "+colour);
		System.out.println("The brand of the pen is "+ brand);
	}
	public static void main (String[]args)
	{
	Pen p1=new Pen();
	p1.price=20;
	p1.type= "gel";
	p1.colour="blue";
	
	Pen p2=new Pen();
	p2.price=45;
	p2.type="ink";
	p2.colour="black";
	
	Pen p3=new Pen();
	p3.price=35;
	p3.type="ball";
	p3.colour="green";
	
	p1.printDetails();
	System.out.println("-----------------------------------------------------------------");
	p2.printDetails();
	System.out.println("-----------------------------------------------------------------");
	p3.printDetails();
	

	}

}
