package Array;

public class MainArr2 
{
	public static int getProduct(int ar[])
	{
	int product=ar[0];
	for(int i=1; i<ar.length; i++)
	{
		 product=product*ar[i];
	}
	return product;
	}
	public static void main(String[] args)
	{
	int x[]= {34,56,78,98,76};
	int pr= getProduct(x);
	System.out.println("the product of the given array is :"+pr);

	}

}
