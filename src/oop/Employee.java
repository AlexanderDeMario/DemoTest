package oop;

public class Employee 
{
	String name;
	int eid;
	double salary;
	Employee(String name,int eid,double salary)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
	}
	Employee(String name)
	{
		this.name=name;
	}
	Employee(int eid,double salary)
	{
		this.eid=eid;
		this.salary=salary;
	}
	Employee(double salary,String name)
	{
		this.salary= salary;
		this.name=name;
	}
	void display()
	{
		System.out.println("The name of the employee is "+ name);
		System.out.println("The employee id is "+ eid);
		System.out.println("Salary of the employee is "+ salary);
	}
	public static void main(String[] args)
	{
		Employee E1=new Employee("Ramesh",1234,45000);
		Employee E2=new Employee("Rahul");
		Employee E3=new Employee(3214,38000);
		Employee E4=new Employee(45000,"Suresh");
	 E1.display();
	 System.out.println("-------------------------------------------");
	 E2.display();
	 System.out.println("-------------------------------------------");
	 E3.display();
	 System.out.println("-------------------------------------------");
	 E4.display();
	 System.out.println("-------------------------------------------");
	 Employee E5=new Employee(25000,"Chotu");
	 E5.display();
		

	}

}
