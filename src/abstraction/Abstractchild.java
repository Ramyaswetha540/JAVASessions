package abstraction;
//overriding is the feature where the subclasess implements the methods which are provide in parent class

public class Abstractchild extends ParentAbstract
{
	@Override
	void method() {
		System.out.println("overriden parent method");
	
	}


public static void main(String[] args)
{
	Abstractchild ac=new Abstractchild();
	ac.method();
	ac.method3();
	ac.method2();
}
}