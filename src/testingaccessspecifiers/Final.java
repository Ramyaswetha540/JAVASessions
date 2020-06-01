package testingaccessspecifiers;

public class Final {

	public static void main(String[] args) {
	final int i=10;//constant values are fixed u cannot change 
	//	i=20; it shoes error when u try to change the value
	//	i=30;
		
		System.out.println(i);

		
		//if any class or any method is final in parent class and if you want to inherit the methods of parent class then you cannot inherit as the method or class is mentioned final that means u cannot change
		//purpose of final keyword (when u mentioned in parent class)
		//to prevent inheritance
		//to prevent overriding
		
		
	}

}
