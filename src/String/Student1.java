package String;

public class Student1
{
	void display(String name,int age)
	{
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
	}
	void display(int id,String location)
	{
		System.out.println("Id is "+ id);
		System.out.println("Location is "+ location);
	}
	void display(double salary, String state)
	{
		System.out.println("slaray is "+ salary);
		System.out.println("state is "+ state);
	}
	
	public static void main(String[] args) 
	{
		Student1 ob=new Student1();
		ob.display("Rahul",28);
		ob.display(1234,"Jamshedpur");
		ob.display(5000.45,"Banglore");
		System.out.println("---------------------------");
		ob.display("Ramesh",30);
		ob.display(3214,"Ranchi");
	
		
	
	}

}
