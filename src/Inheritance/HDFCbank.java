package Inheritance;

public class HDFCbank extends Bank{
	
	
	public void saftey()
	{
		System.out.println("hdfc saftey");
	}
	
	public void locker()
	{
		System.out.println("hdfc locker");
	}
	
	public void carloan()
	{
		System.out.println("hdfc car loan");
	}

	public static void main(String[] args) {
		
		HDFCbank hdfc=new HDFCbank();
		hdfc.carloan();
		hdfc.deposit();
		hdfc.loan();
		hdfc.locker();
		hdfc.saftey();
		hdfc.transfer();
	
		
	HDFCbank hdfcbank=(HDFCbank) new Bank();//downcasting parent object child reference -parent can access the child methods which are not inherited also
	hdfcbank.carloan();
	hdfcbank.locker();
	hdfcbank.saftey();
	hdfcbank.deposit();
	hdfcbank.loan();
	hdfcbank.transfer();
	
	
	
	}

}
