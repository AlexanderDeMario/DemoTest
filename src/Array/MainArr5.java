package Array;

public class MainArr5 
{
	public static double getAverage(int ar[])
	{
	 double sum=0;
	for(int i=0;i<ar.length;i++)
	{
		sum=sum+ar[i];
	}
	return sum/ar.length;
	}

	public static void main(String[] args)
	{
		int x[]= {23,5,78,98,21};
		double av=getAverage(x);
		System.out.println("average of the given array is "+ av);
	

	}

}
