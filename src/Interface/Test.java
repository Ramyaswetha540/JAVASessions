package Interface;

public class Test {

	public static void main(String[] args) {
		// create object of Hsbc which implement usbank as we canot create object  of interface

		HSBC h=new HSBC();//compiletime polymorphism calling overriden methods
		h.carloan();
		h.credit();
		h.transfer();
		h.house();
		System.out.println("=================");
		
	
//dynamic polymorpishm
	
		//child obj can be ref by parent interface 
		
		USBank u=new HSBC();
		u.carloan();
		u.credit();
		u.transfer();		
		
		
		//calling variable and static method of usbank
		
		System.out.println(USBank.min_bal);
		
		USBank.debit();
	}

}
