package InterviewPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		for(int i=1;i<=30;i++)
		{
			int count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0)
					count++;
			}
			if(count==0)
		System.out.print(i+ " ");
	 }
   }
}
