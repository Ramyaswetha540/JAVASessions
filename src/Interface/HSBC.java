package Interface;

public class HSBC implements USBank {
//if a class is implementing any interface it is madidatory to define /override the methods
	
	@Override
	public void credit() {
		System.out.println("credit--hsbc");
		
	}

	@Override
	public void transfer() {
		System.out.println("debit--hsbc");
		
	}

	@Override
	public void carloan() {
		System.out.println("carloan-hsbc");
		
	}
	
	public void house()
	{
		System.out.println("house-hsbc");
	}

}
