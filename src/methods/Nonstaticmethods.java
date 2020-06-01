package methods;

public class Nonstaticmethods {
	
	//after creating a object, the copy of nonstatic methods are given to the object
	public void test()//void-does not return any value,no input ,no output
	{
		System.out.println("testmethod");
	}
	
	public int add()//int is return type it will return c value,no input ,someoutput
	{
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	public String qa()//string return type no input ,someoutput
	{
		System.out.println("this is qamethod");
		String s="selenium";
		return s;
	}
	
	public int div(int x,int y)//int return type,input and some output
	//x,y are input parameters
	{
		System.out.println("division method");
		int d=x/y;
		return d;
	}

	public static void main(String[] args) {
		
		//we never write return statement inside the main method so main method will be void 
	   //main method is starting point of execution
		
		//create an object for this class
		Nonstaticmethods ob=new Nonstaticmethods();
		System.out.println(ob.add());
		
		System.out.println(ob.div(30,3));
		
		System.out.println(ob.qa());
		
		
		ob.test();
		
		

	}

}
