package accessspecifiers;

//can access all specifiers within class and with in package

public class Accessspecifiersconcept {
	
		public void publicspecifier()
	{
		System.out.println(" This is public specifier method");
	}
    private void privatespecifier()
        {
          System.out.println("This is private specifier method");	
         }
    protected void protectedspecifier()
    {
    	System.out.println("This is protected specifier method");
    }
    void defaultspecifier()
    {
    	System.out.println("This is default specifier method");
    }

	public static void main(String[] args) {
		
		Accessspecifiersconcept ob=new Accessspecifiersconcept();
		ob.publicspecifier();
		ob.privatespecifier();
		ob.defaultspecifier();
		ob.protectedspecifier();

	}

}
