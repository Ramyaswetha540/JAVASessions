package javainterviewprograms;

public class ReverseInteger {

	public static void main(String[] args) {
		int num=1234;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev * 10 + num%10;
			num=num/10;
		}
       System.out.println(rev);
       //using string buffer
       long num1=123456;
       StringBuffer sf=new StringBuffer(String.valueOf(num1));
       System.out.println(sf.reverse());
	}

}
