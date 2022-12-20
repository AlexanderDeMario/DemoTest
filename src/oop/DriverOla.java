package oop;

public class DriverOla {

	public static void main(String[] args)
	{
		Ola ob=new Mini();
		ob.ride();
		//ob.displayRate();//not over ridden in Ola & Mini class.
		Mini o=(Mini)ob;
		o.displayRate();
		
	Ola ob1=new Sedan();
	 ob1.ride();
	// ob1.displayRate();//not over ridden in Ola &Sedan class.
	 Sedan s=(Sedan)ob1;
	 s.displayRate();
	 
		Ola ob2=new Prime();
		ob2.ride();
		//ob2.displayRate()//not over ridden in Ola & Prime  class.
		Prime l=(Prime)ob2;
		l.displayRate();

	}

}
