package oop;
class A
{
	int a=20;
}
class B extends A
{
	int a=200;
    void display()
    {
    	float a=987.2f;
    	System.out.println(a);
    	System.out.println(this.a);//varible shadowing,to access global variable of same class.
    	System.out.println(super.a);//global varable of parent class.
    }
}
public class Varshadowing
{

	public static void main(String[] args) {
		B ob=new B();
		ob.display();
	

	}

}
