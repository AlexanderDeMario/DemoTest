package Array;

public class MainArr1 
{
public static int getDifference(int ar[])
{

	
	 int diff=ar[ar.length-1]-ar[0];
	 return diff;
	
 
}
	public static void main(String[] args) 
	{
		int x[]= {34,56,78,98,76};
		int c=getDifference(x);
        System.out.println("difference of number is "+c);
     

	}
//changes in mainArr1 class
}
