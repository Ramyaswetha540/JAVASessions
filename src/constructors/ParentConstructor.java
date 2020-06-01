package constructors;

public class ParentConstructor {
	
	int a;
	int b;
	
	public ParentConstructor(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		
		ParentConstructor pc=new ParentConstructor(20,30);
		
	}


}
