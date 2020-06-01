package Interface;

/*only method declaration
 * no method body if it is non static method -only method prototype
 * in interface we can declare variables ,variables are static in nature
 * variables values will not change
 * after java 8 we can declare static and nonstatic methods with body
 * no main method in interface
 * interface is abstract in nature -we cannot create object of interface*/

public interface USBank {
	
	int min_bal=1000;
	
	public void credit();
	public void transfer();
	public void carloan();
	
public static void debit()
{
System.out.println("this is static method");	
}

}
