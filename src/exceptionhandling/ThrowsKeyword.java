package exceptionhandling;

public class ThrowsKeyword {
//in throws we cannot report anything.it is always used in method chaining
//if we have n num of exceptions in program using try catch it is very difficult to handle 
//so to void this we use throwskeyword to handle exceptions
	//
	
	
	public static void main(String[] args)
	{//throws ArithmeticException{//it will catch the exception and throws to JVM  will accept the exception
		
		
ThrowsKeyword th=new ThrowsKeyword();
th.sum();
System.out.println("hello");//this will be not printed in console as the exception is occured in the above line and it will terminate the program to handle this we need to use try n catch 
	}
	
	
	public void sum()                 //throws ArithmeticException//it will catch the exception and throws to main method as sum is called bt main method
	{
		try
		{
		div();
		}catch(ArithmeticException e)
		{
			System.out.println("exception handled without reaching main");
		}
	}
	public void div() throws ArithmeticException//it will throw exception to sum() as it is calling
	{
		int i=9/0;
	}

}
