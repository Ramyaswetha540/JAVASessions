package javainterviewprograms;

public class StringManupulation {

	public static void main(String[] args) {
		
		
		String str="selenium automation Testing";
		
		System.out.println(str.charAt(5));//print letter ar 5th index
		
		System.out.println(str.endsWith("ing"));//return boolean
		
		System.out.println(str.indexOf("o"));
		
		System.out.println(str.length());
		
		System.out.println(str.indexOf("e"));
		//if u want to know index of another e present in the string
		//this is hard code value 
System.out.println(str.indexOf('e', 2));//first e is at 1 so we need to start from 2
//instead of above we can write
System.out.println(str.indexOf('e',str.indexOf('e')+1));

System.out.println(str.indexOf('e',str.indexOf('e')+3));//3rd occurance of e


System.out.println(str.indexOf("hello"));//it the element is not there then it return -1


String str1= "selenium automation testing    ";


System.out.println(str.equals(str1));

System.out.println(str.equalsIgnoreCase(str1));

System.out.println(str.substring(0, 8));

System.out.println(str1.trim());

String str2="selenium testing";
String s=" notes";
int a=100;
System.out.println(s+a);//notes100
System.out.println(str2+s);

System.out.println(str2.replaceAll(" ",""));

System.out.println(str2.concat(" material"));

String str3="01-02-2020";
System.out.println(str3.replaceAll("-", "/"));

String str4="Hello_welcome_to_selenium_testing";

 String test[]=str4.split("_");

 for(int i=0;i<test.length;i++)
 {
	System.out.println(test[i]);
 }

 
 

	}

}
