package oop;

public class DriverAccount
{
public static void main(String[] args) 
{
	Account ob=new Account();
	ob.name="rakesh";
	ob.accountno=7894561l;
	ob.setPin(7894);
	
	Account ob1=new Account();
	ob1.name="Rahul";
	ob1.accountno=123456l;
	//ob1.setPin(5468);
	
	System.out.println("Bank details");
	System.out.println(ob.name);
	System.out.println(ob.accountno);
	System.out.println(ob.getPin());
	System.out.println(ob.getBalance());
	System.out.println("----------------------------------------------");
    System.out.println(ob1.name);
    System.out.println(ob1.accountno);
	}

}
