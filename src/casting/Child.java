package casting;

public class Child extends Parent{
	
		public void method1()
	{
		System.out.println("child class method");
    }
		
		public void method2()
		{
			System.out.println("child class method2");
		}

	
	public static void main(String[] args) {
	
		Child o=new Child();
		o.method1();
		o.method2();
		
		Child ob=(Child) new Parent();//downcasting-parent can acess the child class other methods i.e which are not inherited from parent
		ob.method1();
		ob.method2();
      
		Parent obj=new Child();//upcasting-child can access the inherited method of parent class using parent reference
	   obj.method1();
}
  

}