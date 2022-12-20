package Array;

public class MainArr6 
{
	public static int getBiggest(int ar[])
	{
	int big=ar[0];
	for(int i=1;i<ar.length;i++)
	{
		if(ar[i]>big)
		big=ar[i];
	}
	return big;
	}
	public static int getSmallest(int[]ar)
	{
		int small=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]<small)
				small=ar[i];
		}
		return small;
	}
	public static void main(String[] args) 
	{
     int x[]= {12,56,79,99,21,6};
     int bg=getBiggest(x);
     int sm=getSmallest(x);
     int c=bg-sm;
     System.out.println("the difference of biggest and smallest no is "+ c);

	}

}
