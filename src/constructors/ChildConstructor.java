package constructors;

public class ChildConstructor extends ParentConstructor {
	
//if parent as constructor 	then in respective child should call the parent constructor using super keyboard
	
	

	public ChildConstructor(int a, int b) {
		super(20,30);
	
	}
	
	static int i;
	

	public static void main(String[] args) {
		
    i=10;
	}

}
