package javainterviewprograms;
//s.rev we cannot use it as string is immutable object  
//stringbuffer is mutable we have rev function 

public class ReverseString {

	public static void main(String[] args) {
	
		String s="selenium";
		int len= s.length();
		String rev="";
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}

		System.out.println(rev);
	
	//using string buffer
		StringBuffer sf=new StringBuffer(s);
		System.out.println(sf.reverse());
		
	}
	

}
