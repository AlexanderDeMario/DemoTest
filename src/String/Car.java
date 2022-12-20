package String;

public class Car
{
	String brand;
	String colour;
	double price;
	Car(String brand,String colour,double price)
	{
		this.brand=brand;
		this.colour=colour;
		this.price=price;
	}

	public String toString()
	{
		return "Car [brand=" + brand + ", colour=" + colour + ", price=" + price + "]";
	}
	
}