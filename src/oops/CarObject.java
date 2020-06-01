package oops;

public class CarObject {
//class variables
	int mod;
	int wheel;
	
	public static void main(String[] args) {
	
		
		//lets create 3 objects of carobject class
		//new CarObject() is the objectof the class and a is the reference for that perticular object created 
		//new keyword is used to create object
		//a,b,c object ref variables
		
		CarObject a=new CarObject();
		CarObject b=new CarObject();
		CarObject c=new CarObject();
		
		a.mod=1986;
		a.wheel=4;
		
		b.mod=2013;
		b.wheel=4;
		
		c.mod=2014;
		c.wheel=4;
		System.out.println("before shifting references");
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		System.out.println("after shifting references");
		
		a=b;
		b=c;
		c=a;
		
		System.out.println(a.mod);//a refering b object now 2013
		System.out.println(b.mod);//b refering c object now 2014
		System.out.println(c.mod);//as a is refering b, c also refer b object 2013
		
		
		
		

	}

}
