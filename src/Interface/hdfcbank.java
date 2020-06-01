package Interface;
// Here Ukbank and the Usbank are the main parent banks if you want to open a hdfc bank in us r uk you need to implement there basic methods then only they will allow you to open a branch 
//here hdfc can have its own methods also but the main methods of the parent should be followed compulsory this is called override-same method names with same parameters
//In interface 100percent abstraction is acheived
//multiple inhertiance is also acheived using interface
//a child can implement multiple parent class methods
// satic methods cannot be implemented by child by they can be called using interfacename.method
public class hdfcbank implements UKbank,USBank{

	@Override
	public void deposit() {
		System.out.println("deposit hdfc");
	}

	@Override
	public void loan() {
	
		System.out.println("loan hdfc");
	}

	@Override
	public void transfer() {
	 System.out.println("transfer");
		
	}

	@Override
	public void carloan() {
	System.out.println("carloan");
		
	}
public static void main(String[] args)
{
	hdfcbank hdfc=new hdfcbank();
	hdfc.carloan();
	hdfc.deposit();
	hdfc.loan();
	hdfc.transfer();
	UKbank.safety();//calling by interface name(classname) for static methods
	
}

@Override
public void credit() {
	// TODO Auto-generated method stub
	
}
}
