package oop;

public class MainArr1
{

	public static void main(String[] args) 
	{
		int x[]= {34,56,78,98,76};
		int sm =sumOfArray(x);
		System.out.println("Sum of the last and first element is "+sm );

	}
   public static int sumOfArray(int[]ar)
   {
	   return ar[0]+ar[ar.length-1];
   }
}
