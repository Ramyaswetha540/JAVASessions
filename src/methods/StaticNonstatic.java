package methods;

//syntax:  Accessspecifiers/modifiers/returntype/methodname(){statements}
//Accessspecifiers -public,private,protected,default
//modifiers-static /non static
//returntype-void /string/int
//static methods can be called using object ref also but it will give warning static methods should be accessed in a static way
//i.e either called directly by method name or classname.methodname but not by obj ref


public class StaticNonstatic {
	static String name="Testing";
	 int age;
	
	public void method1() {
		
		System.out.println("this is non static method");
	 
	}
	
       public static void method2() {
		
		System.out.println("this is  static method");
	 
	}
	
	public static void main(String[] args) {
					
			//static
			method2();
			System.out.println(name);
			//non static
			
			StaticNonstatic obj=new StaticNonstatic();
			System.out.println(obj.age=23);
			obj.method1();
		

	}
	}


