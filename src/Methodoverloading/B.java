package Methodoverloading;

public class B {
	
	public static void main(String[] args) {
		
		System.out.println("b method");
		
		//in this B class methos is called first 
		//A.main(args);//we can call a method but once a method is called it will execute A method class and 
		//then B as Bclass main is called in A class from there it will come tO B class
		//and here it calls b method main first and then a class method...
		//this will continue so it is not good practice to overload main method
		

	}

}
