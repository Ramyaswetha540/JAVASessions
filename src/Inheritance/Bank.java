package Inheritance;

public class Bank {

	public static void main(String[] args) {
		
	Bank b=new HDFCbank();//upcasting parent ref child obj only inherited objects are executed
	b.deposit();
	b.transfer();
			
	}
		
		public void deposit()
		{
			System.out.println("deposit money");
		}

     public void loan()
     {
    	 System.out.println("loan ");
     }
     
     public void transfer()
     {
    	 System.out.println("transfer");
     }
//public void locker()
//{
//	System.out.println("locker");
//	
//}
}
