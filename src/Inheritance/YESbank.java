package Inheritance;

public class YESbank extends Bank{
	
public void deposit()
		{
			System.out.println("yesbank deposit");
		}
public void goldloan()
{
	System.out.println("yesbank goldloan");
	
	}

public void transfer()
{
	System.out.println("yesbank transfer");
}

public static void main(String[] args) {
	
	YESbank obj=new YESbank();
	obj.transfer();
	obj.goldloan();
	obj.deposit();
	obj.loan();
	//obj.locker();
	
	
	
}
	

}
