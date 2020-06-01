package collections;
//haspmap is to store the data inform of keys and values
//it is non synchronised -in multi threading  every  thread can access the hasmap object-not threadsafe
//performace will be better as each access symutaneously
//it contains only unique elements
//hashmap is a class implements Map interface
//hashmap extends abstraction map
//it may have one null key and multiple number of null values can be stored
//it maintains no order
//no indexes here
//concurrentModificationException-False fast condition it means
//when any thread adding or removing the values of the 
//key sametime councurrently other thread want to access that time it gets this exception
//FailFastCondition--as it is not synchronize multi threading happens if one thread update on key value other thread wants to access the same key then it will get updated value instead of old value this is the problem with hashmap 
//due to this ConcurrentModificationException(FailFastCondition) occurs -any thread update or mofidy the structure this exception occurs
//Entry set and Enumiration elements -print all key and values 
import java.util.HashMap;

import java.util.Map.Entry;

//we use in multithreading to increase the performace

public class HashMapConcept {
	
	public static void main(String[] args)
	{
		HashMap<Integer,String> h=new HashMap<Integer,String>();  
		
		 h.put(1,"tom");
		 h.put(2,"john");
		 h.put(3,"value");
		 h.put(4,"jack");
		 
		 System.out.println(h.get(2));//displays key value based on key
		 System.out.println(h.get(7));//null  
		 
		//to print all using advance for loop 
		 // hash map obj.entryset() to display
		 //key.getkey()
		 //key.getvalue
		 
		 for(Entry<Integer, String> m: h.entrySet())//import entry for java util map
		 {
			System.out.println(m.getKey()+" "+m.getValue()); 
		 } 
		 
		 //remove()
		 h.remove(2);
		 System.out.println(h); 
		 //2nd key is removed but the position not stored by others
		 //it doesnt maintain ordering
		 System.out.println(h.containsKey(4));//returns boolean value
		 }
		 
	}


