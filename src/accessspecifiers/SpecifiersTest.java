package accessspecifiers;

public class SpecifiersTest {
	
	//public,default,protected -within package(anotherclass)
	//private can be access only using getter and setter methods

	public static void main(String[] args) {
		
		Accessspecifiersconcept obj=new Accessspecifiersconcept();
		obj.defaultspecifier();
		obj.protectedspecifier();
		obj.publicspecifier();

	}

}
