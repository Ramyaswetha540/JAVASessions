package abstraction;

//it is the process of hiding the implemention details 
//if any of the method is abstract then the class should be abstract class

//void m1(); you should mention abstract compulsoryly if not it should have body
//in this we can have static and non static defualt methods 
//it is also know as partial abstraction
//the implementing class i.e child class should not be abstract class
      public abstract class ParentAbstract {

		abstract void method();
		
         public static void method2()
         {
        	 System.out.println("this is abstraction class");
         }
	
	public void method3() {
		System.out.println("method3");
	}
	
			
		

	

}
