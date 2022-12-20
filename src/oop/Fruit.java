package oop;

public class Fruit {
String colour;float price;

public Fruit(String colour, float price) {
	this.colour = colour;
	this.price = price;
}
@Override
public String toString() {
	return "Fruit [colour=" + colour + ", price=" + price + "]";
}


void displayFruit()
{
System.out.println(colour);
System.out.println(price);
}
}
