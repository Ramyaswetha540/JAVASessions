package Methodoverloading;

public class A {
	
	public static void main(String[] args) {
		
//b class method is static and public it can be called here
		
		System.out.println("a method");
	
		B.main(args);
		
		//here in this class A class main is called and then B class main
	}

	

}
