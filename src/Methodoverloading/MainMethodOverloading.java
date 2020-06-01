package Methodoverloading;

//you can overload the main method also but with different argruments ...it is not good practice to overload the main method 

public class MainMethodOverloading {
	
	
	public static void main(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(int c,int d,int e)
	{
		int f=c*d*e;
		System.out.println(f);
	}
	
	public static void main(int a,int b,int c,int d)
	{
		int e=a+b+c+d;
		System.out.println(e);
	}

	public static void main(String[] args) {
	
		//Methodoverloadingconcept ob=new Methodoverloadingconcept();
	      main(20,30);
	      main(20,30,40);
	      main(30,40,50,60);
	      
	       
				
	}

}
