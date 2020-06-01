package Interface;

public class bankTest implements USBank{

	@Override
	public void transfer() {
		System.out.println("bank implements ukbank");
		
	}

	@Override
	public void carloan() {
		System.out.println("bank implements ukbank car loan");
		
	}

	public static void main(String[] args)
	{
		bankTest b=new bankTest();
		b.carloan();
		b.transfer();
		
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		
	}
	
	
}
