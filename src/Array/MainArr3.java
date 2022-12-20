package Array;

public class MainArr3 
{
	public static int getBiggest(int ar[])
	{
		int big=ar[0];
		for(int i=1; i<ar.length;i++)
		{
			if(ar[i]>big)
			big=ar[i];
		}
		return big;
	}

	public static void main(String[] args) 
	{
		int x[]= {34,56,78,98,76};
		int bg=getBiggest(x);
		System.out.println("the biggest number in the array is :"+ bg);
		

	}

}
