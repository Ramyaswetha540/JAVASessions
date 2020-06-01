package oops;

public class Wrapperclass {

	public static void main(String[] args) {
		
		
		String s="100";
		//convert string to int
		int a=Integer.parseInt(s);
		System.out.println(a);
		
		String p="true";
		//convert string to boolean
		
	boolean b=Boolean.parseBoolean(p);
	System.out.println(b);
	
	String q="12.34";
	//covert string to double
      double d=Double.parseDouble(q);
      System.out.println(d);
      
      int i=10;
      //convert int to string
      String st =String.valueOf(i);
      System.out.println(st+20);
      
    // String s1="100A";
     // Integer.parseInt(s1);//it gives NumberFormatException
      
      
	}

}
