package oop;

public class StudentQJ
{
	String name;
	int age;
	long id;
	static String branch="BTM" ;
	public void display()
	{
     System.out.println("the name of the student is "+ name);
   
     System.out.println("the age of the student is "+ age);
     
     System.out.println("the id of the student is "+ id);
     
     System.out.println("the name of the branch is "+ branch);
    
	}
	public static void main(String[]args)
	{
	StudentQJ s1= new StudentQJ();
	s1.name="Virat";
	s1.age=27;
	s1.id=12345;
	
	StudentQJ s2=new StudentQJ ();
	s2.name="Dhoni";
	s2.age=29;
	s2.id=54123;
	
	StudentQJ s3=new StudentQJ ();
	s3.name="Raina";
	s3.age=25;
	s3.id=78945;
	
	s1.display();
	 System.out.println("---------------------------------------");
	s2.display();
	 System.out.println("---------------------------------------");
	s3.display();
	}

}
