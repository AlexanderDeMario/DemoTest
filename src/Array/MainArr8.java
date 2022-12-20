package Array;

public class MainArr8
{
	public static int getEven(int ar[])
	{
		int even=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			even=even+ar[i];
		}
			return even;
	}
public static int getOdd(int ar [])
{
	int odd=0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]%2!=0)
			odd=odd+ar[i];
	}
			return odd;
}

public static void main(String args[])
{
	int x[]= {12,23,17,56,96,54};
	int ev=getEven(x);
	int od=getOdd(x);
	System.out.println("the sum of even is "+ ev);
	System.out.println("the sum of odd is "+ od);
	
}
}
