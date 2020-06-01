package condition;

public class NestedIf {
	
	public static void main(String[] args) {
		
		
		int a=10;
		int b=30;
		int c=70;
		
		if(a>b&&a>c)
		{
			System.out.println("a is big");
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is big");
		}
		else if(c>a&&c>b)
		{
			System.out.println("c is big");
		}
		
		
		
		
		
	}

}
