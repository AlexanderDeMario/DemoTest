package oop;

public class EmployeeTY
{
	String name;
	int age;
	double salary;
	String place;
 static
    {
	System.out.println("The comapany id is TY53215");
    
	   System.out.println("The comapany very ueful for experienced guys");	
	   System.out.println("__________________________________________________________________________");
     }
 void display()
{
	System.out.println("The name of the employee is "+ name);
	System.out.println("The age of the employee is "+ age);
	System.out.println("The salary of the employee is "+ salary);
	System.out.println("The employee is from"+ place);
}
public static void main(String[]args)
{
	EmployeeTY e1=new EmployeeTY();
	e1.name="Rahul";
	e1.age=29;
	e1.salary=35000d;
	e1.place="Jamshedpur";
	
	EmployeeTY e2=new EmployeeTY();
	e2.name="Ajay";
	e2.age=28;
	e2.salary=30000d;
	e2.place="Rajasthan";
	
	EmployeeTY e3=new EmployeeTY();
	e3.name="Babulal";
	e3.age=27;
	e3.salary=31000d;
	e3.place="Ranchi";
	
	e1.display();
	System.out.println("__________________________________________________________________________");
	e2.display();
	System.out.println("__________________________________________________________________________");
	e3.display();
}
	

}
