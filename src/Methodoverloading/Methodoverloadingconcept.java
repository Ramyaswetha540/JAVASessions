package Methodoverloading;
//methodoverloading in this the method name will be same but with different arguements  or input parameters in same class..
//method inside the method is not allowed-i.e same method with same arguements are not allowed


public class Methodoverloadingconcept {
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public int add(int a,int b,int c)
	{
		
		return a+b+c;
	}
	

	public int add(int a,int b,int c,int d)
	{
		
		return a+b+c+d;
	}
	
	public static void main(String[] args)
	{
		Methodoverloadingconcept  m=new Methodoverloadingconcept();
		m.add(10,20);
	System.out.println(m.add(20,30,40));
	System.out.println(m.add(100,40,10,20));

}
}