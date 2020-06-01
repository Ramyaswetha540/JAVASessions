package javainterviewprograms;

public class RegularExpression {

	public static void main(String[] args) {
	//regular expression [^a-zA-Z0-9]
		String s= "#$#$$% testing 0123344";
		
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");

		
		System.out.println(s);
	}
	

}
