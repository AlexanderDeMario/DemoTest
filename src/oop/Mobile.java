package oop;

public class Mobile
{
	String brand;
	double price;
	String colour;
	static 
	{
		System.out.println("the main use of mobile is to make call");
	}
	{
		System.out.println("make one object");
	}
    void display()
    {
    	System.out.println("the brand of the mobile is "+ brand);
    	System.out.println("the price of the mobile is "+ price);
    	System.out.println("the colour of the mobile is "+ colour);
    }
    public static void main(String[]args)
    {
    	Mobile m1=new Mobile();
    	m1.brand="Samsung";
    	m1.price=35000d;
    	m1.colour="Red";
    	
    	Mobile m2=new Mobile();
    	m2.brand="Nokia";
    	m2.price=30000d;
    	m2.colour="Black";
    	
    	Mobile m3=new Mobile();
    	m3.brand="Oppo";
    	m3.price=32000d;
    	m3.colour="White";
    	
    	m1.display();
    	System.out.println("_---------------------------------------------------------------------");
    	m2.display();
    	System.out.println("_---------------------------------------------------------------------");
    	m3.display();
    }

    	
    		
    }

