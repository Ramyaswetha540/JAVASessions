package testingaccessspecifiers;

public class Finalize {
	
	//finalize is related to garbage collector...
	//it is used to perform cleaning the process when u make a method finalize before calling garbage collector finalize will clean up the process
	
public void finalize()//before calling gc finalize method is called inorder to clean up the process of the object which dont have refernces
{
	System.out.println("finalize method");
}
	public static void main(String[] args) {
		
		Finalize f1=new Finalize();
		Finalize f2=new Finalize();
		
		f1=null;//this means the objects are refering anything as f1 n f2 are null
		f2=null;

		//calling garbagecollector
		System.gc();//used to destroy the objects which don't have any reference to make some free memory
		
		
		
	}

}
