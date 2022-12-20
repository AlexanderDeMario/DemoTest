package oop;
class song
{
	void rythm()
	{
		System.out.println("slow pace");
	}
}
class RemixSong extends song
{
	void rythm()
	{
		System.out.println("fast and terror");
		super.rythm();
	}
}

public class DriverRTP 
{
	public static void main(String[] args) {
		RemixSong ob=new RemixSong();
		ob.rythm();
	}
	
}

