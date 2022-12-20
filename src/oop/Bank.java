package oop;

public class Bank 
{
	String branch;
	String IFSCcode;
	String Holdername;
	long mobno;
	double balance;
	long accountno;
	Bank(String branch,String IFSCcode,String Holdername,long mobno,double balance,long accountno)
	{
		this.branch=branch;
		this.IFSCcode=IFSCcode;
		this.Holdername=Holdername;
		this.mobno=mobno;
		this.balance= balance;
		this.accountno=accountno;
	}
	void details()
	{
		System.out.println("Name of the branch is "+ branch);
		System.out.println("IFSC code of the branch is "+ IFSCcode);
		System.out.println("Name of the account holder is "+ Holdername);
		System.out.println("Contact number is "+mobno);
		System.out.println("Balance is "+ balance);
		System.out.println("Account number is "+ accountno);
	}
	public static void main(String[] args) 
	{
		Bank b=new Bank("SBI","SBI000N","Rahul",91028815,54000,10013474);
		Bank a=new Bank("Axis bank","AXIS24587","Amar",99393294,45000,56200478);
		b.details();
		System.out.println("------------------------------------");
		a.details();
		

	}

}
