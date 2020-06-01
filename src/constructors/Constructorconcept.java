package constructors;

public class Constructorconcept {
	
	
	int length;
	int breadth;
	
	public Constructorconcept(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
		System.out.println(length*breadth);
	}
	
	public static void main(String[] args)
	{
		Constructorconcept c=new Constructorconcept(10,20);
		
	}
	
}
