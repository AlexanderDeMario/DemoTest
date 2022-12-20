package InterviewPrograms;

import java.util.Scanner;

public class SwapingWithoutThirdVar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two digits");
		int x=sc.nextInt();
		int y=sc.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x);
		System.out.println(y);
	}

}
