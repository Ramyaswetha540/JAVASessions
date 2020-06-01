package oops;

public class Localandglobalvariables {
	
	//global variables//scope through out the program
	int a=30;
	
	String s="selenium";
	

	public static void main(String[] args) {
	//i is local variable for main method/ scope within method
    int i=10;
  //access non static global variables by creating object
    Localandglobalvariables l=new Localandglobalvariables();
    System.out.println(l.a);//30
    
    
	}
	
	
	
	public void test()
	{
		//a,b,c are local variables for test method
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

}
