package oop;

public class Dog 
  {
	String breed;
	String colour;
	String gender;
	int price;
    Dog(String breed,String colour,String gender,int price)
      {
	    this.breed=breed;
	    this.colour=colour;
	    this.gender=gender;
	    this.price=price;
      }
            void details()
            {
            	System.out.println("Breed of the dog is "+ breed);
            	System.out.println("colour the dog is "+ colour);
            	System.out.println("gender of the dog is "+ gender);
            	System.out.println("price of the dog is "+ price);
            }
            static 
            {
            	System.out.println("Details of dogs are");
            	System.out.println("---------------------------");
            }
	public static void main(String[] args) 
	
	{
		Dog d=new Dog("Labrador","black","male",5000);
		Dog o=new Dog("Doberman","white","male",4500);
		Dog g=new Dog("Great den","brown","female",3000);
		d.details();
		System.out.println("________________________________________________________");
		o.details();
		System.out.println("________________________________________________________");
		g.details();

	}

}
