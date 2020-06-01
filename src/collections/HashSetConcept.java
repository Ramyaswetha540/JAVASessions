package collections;

import java.util.HashSet;

import java.util.Iterator;

//It represents the unordered set of elements which doesn't allow us to store the duplicate items.
//We can store at most one null value in Set. 
//Set is implemented by HashSet, LinkedHashSet, and TreeSet(ascending order).
//It represents the collection that uses a hash table for storage.
//Hashing is used to store the elements in the HashSet. 
//It contains unique items.
public class HashSetConcept {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
		
		System.out.println("-----------------");
		
		
		}  
	}

}
