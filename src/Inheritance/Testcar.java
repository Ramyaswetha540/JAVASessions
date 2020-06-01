package Inheritance;

public class Testcar {

	public static void main(String[] args) {
	//static polymorphism or compiletime polymorphism(at compile methode jvm decide which method to call)
		BMW ob=new BMW();
		ob.start();// bmw class 
		ob.stop();//stop method is not prensent in bmw it inherits the method from car class
		ob.refuel();//bmw class

		System.out.println("=========================");
		
		Car c=new Car();
		c.start();
		c.stop();
	//	c.refuel();//cannot access bmw class method
		
		System.out.println("=============");
		
		//topcasting or downcasting
	Car c1= new BMW();//this is possible child class bmw object can be refered by car class( parent) reference variable
	//this is now as dynamic polymorphism  0r Runtime polymorphism
	c1.start();//overriden method bmw will be called
	c1.stop();
//	c.refuel();//cannot access bmw class method
	
	//downcasting it is not allowed
	BMW b=(BMW) new Car();//ClassCastException(runtime jvm will be confused)
	b.refuel();
			
	
	
	}

}
