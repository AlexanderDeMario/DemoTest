package oop;

public class StudentTy 
{
	String name;
	String place;
	int id;
	static
	{
		System.out.println("the company id is TYSPY");
		System.out.println("______________________________________________________");
	}
	public void display()
	{
	System.out.println("the name of the student is "+ name);
	System.out.println("the student is from palce "+ place);
	System.out.println("the id of the student is "+ id);
	}

	public static void main(String[] args) 
	{
		StudentTy s=new StudentTy();
		s.name="Rahul";
		s.place="Ranchi";
		s.id=91023;
		
		StudentTy t=new StudentTy();
		t.name="Rohit";
		t.place="Ramgarh";
		t.id=97023;
		
		s.display();
		System.out.println("_______________________________________________________");
		t.display();

	}

}
