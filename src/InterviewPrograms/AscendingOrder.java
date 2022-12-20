package InterviewPrograms;


public class AscendingOrder
{
	public static void main(String[] args) 
	{
		int []ar={28,35,12,56,97};
		int temp=0;
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = i+1; j < ar.length; j++)
			{
			if(ar[i]>ar[j])
			{
			temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			}
		  }
			System.out.print(ar[i]+ " ");
		}
		//System.out.println(ar[ar.length-2]);
		
	}	
}


