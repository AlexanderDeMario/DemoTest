package oop;
import java.util.Scanner;
public class ICICI extends ATM{
	
		long accountno;
		int pin;
		double balance;
		 void withdrawMoney(int pwd)
		{
			if(pwd==pin)
			{
				System.out.println("enter the amount");
			Scanner sc=new Scanner(System.in);
			double amount=sc.nextDouble();
			balance=balance-amount;
			}
		}
		 
		void checkBalance(int pwd)
		{
			if (pwd==pin)
				System.out.println("the balance of the account "+ balance);
		}
		void changePin(int pwd)
		{
			if(pwd==pin)
				
			{
				Scanner s=new Scanner(System.in);
				System.out.println("enter your new pin");
				this.pin=s.nextInt();
			}
		}
		void printStatement(int pwd)
		{
			if(pwd==pin)
				System.out.println("account balance is "+ balance);
		}
		
		
		

	public static void main(String[] args) {
		ICICI ob=new ICICI();
		ob.accountno=1234567;
		ob.pin=7688;
		ob.balance=20000d;
		Scanner s=new Scanner(System.in);
				System.out.println("enter pin");
				int pin=s.nextInt();
				ob.withdrawMoney(pin);
				ob.checkBalance(pin);
				

	}

}
