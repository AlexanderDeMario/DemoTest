package Array;

public class MainArr7 
{
	public static int[] countNumber(int ar[])
	{
		int pos=0,nega=0;
				for(int i=0;i<ar.length;i++)
				{
					if(ar[i]>=0)
					pos++;
					else
						nega++;
	            }
	int count[]={pos,nega};
	return count;
    }
	public static void main(String[] args)
	{
		int x[]= {24,-54,36,-34,98,-56,18,93};
		int n[]=countNumber(x);
		System.out.println("count of even number is "+ n[0]);
		System.out.println("count of odd number is "+ n[1]);

	}

}
