package Array;

public class MainArr4 
{
	public static int[] countEO(int ar[])
	{
		int ec=0,oc=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			ec++;
			
			else
				oc++;
		}
		int count[]= {ec,oc};
		return count;
	}

	public static void main(String[] args) 
	{
	int x[]= {34,53,78,98,76,73};
	int ct[]=countEO(x);
	System.out.println("no.of even count is "+ ct[0]);
	System.out.println("no.of even count is "+ ct[1]);

	}

}
