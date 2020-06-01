package collections;

import java.util.Iterator;

import java.util.LinkedHashSet;

//It also contains unique elements. It maintains the insertion order and permits null elements.
public class LinkedhashSetConcept {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
