package InterviewPrograms;

public class ReverseTodayIsMonday {

	public static void main(String[] args) {
		String s = "Today is Monday" ;
		String[] x = s.split(" ");
		 for (int i = x.length-1;i >=0; i--) 
		 {
			System.out.print(x[i]+" ");
		}
        
	}

}
