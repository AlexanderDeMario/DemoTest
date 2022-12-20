package oop;

public class Mango extends Fruit{
	String origin;
	String taste;
	public Mango(String colour, float price, String origin, String taste) {
		super(colour, price);
		this.origin = origin;
		this.taste = taste;
	}
	void displayMango()
	{
		System.out.println(origin);
		System.out.println(taste);
	}
	@Override
	public String toString() {
		return "Mango [origin=" + origin + ", taste=" + taste + ", colour=" + colour + ", price=" + price + "]";
	}
	public static void main(String[] args) {
		Mango m=new Mango("yellow",100f,"bihar","sweeet");
		System.out.println(m);
	}
}
