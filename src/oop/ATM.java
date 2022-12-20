package oop;

public abstract class ATM {
	static String companyincharge="CISCO";
	abstract void withdrawMoney(int pwd);
	abstract void changePin(int pwd);
	abstract void checkBalance(int pwd);
	abstract void printStatement(int pwd);

}
