package oop;

public class Account 
{
	String name;
	private int pin;
	private double balance;
	long accountno;
		public void setPin(int pin)
		{
			this.pin=pin;
		}
			public int getPin()
			{
				return pin;
			}
				public void setBalance(double balance)
				{
					this.balance=balance;
				}
					public double getBalance()
					{
						return balance;
					}
}