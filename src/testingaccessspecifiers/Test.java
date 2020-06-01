package testingaccessspecifiers;

import accessspecifiers.Accessspecifiersconcept;

public class Test extends Accessspecifiersconcept{
	
	public static void main(String[] args)
	{
		Accessspecifiersconcept as=new Accessspecifiersconcept();
		as.publicspecifier();//only public 
		Test t=new Test();//public-everywhere,protected-within class ,within package,other package using inheritance  
		t.protectedspecifier();
		t.publicspecifier();
		
	}

}
