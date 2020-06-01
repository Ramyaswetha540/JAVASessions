package exceptionhandling;

public class Exception {
	int a=10;
	
	
	
	public static void test1()//reorting is there in this if any exception then come to catch block and display the error to print
	
	{
		int i=10;
		try {
			System.out.println("inside try block");
			int k=10/0;
			
		}catch(ArithmeticException e)//if u mention catch(NullPointerException e) then it throws exception
		{
			e.printStackTrace();
			System.out.println(e.getMessage());//where actual error  
		}
			System.out.println("inside catch block");
		}
	

	public static void main(String[] args) {
		
		
		// uncaughtexception-no hint
//		int i=10;
//		int k=10/0;
//		System.out.println(k);
		
		//caughtexception-hint is given
	//	Thread.sleep(2000);//it will give suggestion either to handle by add throw exception
		//or surround by try catch
		
//		Exception e=new Exception();
//		e=null;
//		System.out.println(e);//null
//		System.out.println(e.a);//nullpointerexception

		//exception handling
		//1.try catch block
		
	test1();
		
		
	}

}
