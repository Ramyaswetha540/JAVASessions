package testingaccessspecifiers;


public class Finally {
	
	public static void test1()
	{
		int i=10;
		try {
			System.out.println("inside try block");
			int k=10/0;
			
		}catch(ArithmeticException e)//if u mention catch(NullPointerException e) then it throws exception
		{
			System.out.println("inside catch block");
		}
		
		finally
		{
			System.out.println("after exception print finally block");
		}
	}


	public static void main(String[] args) {
		
//test();

test1();
	}
	
	
	public static void test()
	{
		try
		{
			System.out.println("inside test method");
			throw new RuntimeException("test");
			
		}catch(Exception e)
		{
			System.out.println("insdie catch block");
		}
		
		finally
		{
			System.out.println("inside finally block");
		}
		
				
	}

}
