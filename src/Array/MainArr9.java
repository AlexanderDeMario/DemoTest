package Array;

public class MainArr9 
{
	public static int[] sumEvOd(int ar[])
	{
		int sumEven=0,sumOdd=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
				sumEven=sumEven+ar[i];
			else
				sumOdd=sumOdd+ar[i];
		}
		int total[]= {sumEven,sumOdd};
		return total;
	
	}

	public static void main(String[] args)
	{
		int x[]= {25,56,16,77,13,18,21,29};
		int c[]=sumEvOd(x);
		System.out.println("the sum of even numbers are "+ c[0]);
		System.out.println("the sum of odd numbers are "+ c[1]);
	}

}
