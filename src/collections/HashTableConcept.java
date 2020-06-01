package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {
	
	public static void main(String[] args) {
	// it is similar to hashmap but it is synchronized (thread safe) one by one thread can access hashtableobject 
	//store the data in key and value format
	//key is stored in the form of object and each object has unique hashcode...>value
	//when object created jvm gives each object is given unique hashcode number-32bit
	//if the 2 objects are equal i.e cloning done that time the two objects will have same hashcode num
		
	Hashtable h=new Hashtable();	
	h.put(1,"tom");
	h.put(2,"peter");
	h.put(3,"max");
	h.put(4,"max");
	
	System.out.println(h.get(7));
	
	System.out.println("-------------");
	//null keys and null values are not allowed
	//h.put(null,"min");//java.lang.NullPointerException
	//h.put(7,null);
	
	System.out.println("-------------");
	Hashtable h1=new Hashtable();	
	
	h1=(Hashtable)h.clone();
	System.out.println("values of h"+h);
	System.out.println("values of h1"+h1);
	
	h1.clear();//it will remove all data
	System.out.println("values of h1"+h1);

	System.out.println(h.containsKey(6));
	
	if(h.containsValue("peter"))
		System.out.println("value found");
	
	//print all the values using enumuration
	
	Enumeration e=h.elements();
	System.out.println("value sof h using enumeration");
	
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
		System.out.println();
	}
	
	//get values using Entryset -for loop-Set
	System.out.println("values of h using entryset");
	Set s=h.entrySet();
	System.out.println(s);

	Hashtable h2=new Hashtable();
	h2.put(1,"tom");
	h2.put(2,"peter");
	h2.put(3,"max");
	h2.put(4,"max");	
	//check 2 hastables are equal are not
	if(h.equals(h2))
		System.out.println("equal");
	
	
	System.out.println(h.size());//print size of hashtabele
	
	System.out.println(h.hashCode());//print hashcode
	
	System.out.println(h1.isEmpty());//check whether empty or not if empty true
	System.out.println(h.isEmpty());//false
	
	System.out.println(h.toString());//{4=max, 3=max, 2=peter, 1=tom}
	
	
	
	}


}
