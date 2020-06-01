package Inheritance;

public class BMW extends Car{//"has-a relationship"
//the method which is prensent in parent class and child class with same method name and with same arguements then it is know as MethodOverriding

	public void start()//overridden method
	{
		System.out.println("car start==bmw class");
	}
	public void refuel()
	{
		System.out.println("car refuel==bmw class");
	}

}
