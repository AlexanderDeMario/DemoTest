package oop;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Student1 
{
	String name;
	int age;
	float percentage;
	Student1(String name,int age,float percentage)
	{
	 this.name=name;
	 this.age=age;
     this.percentage=percentage;
	}
	static
	{
		System.out.println("Details of the students are-");
	}
     void display()
     {
    	
    	 System.out.println("Name of teh student is "+ name);
    	 System.out.println("age of the student is "+ age);
    	 System.out.println("percentage of the student is "+ percentage);
    	 
     }
     
	public static void main(String[] args) 
	{
		Student1 s=new Student1("Rajesh",28,72.4f);
		
		Student1 t=new Student1("Prithvi",29,79.4f);
		
		Student1 u=new Student1("Raju",26,82.4f);
		
		s.display();
		System.out.println("___________________________________________________________________________");
		t.display();
		System.out.println("___________________________________________________________________________");
		u.display();	
	}

}
