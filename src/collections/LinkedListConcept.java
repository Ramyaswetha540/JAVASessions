package collections;

import java.util.Iterator;
import java.util.LinkedList;

//it is a dynamic array stores the data based on 2 things 
//1.Actual data
//2.Reference data
//each node(element) is divided in to 2 parts one is data and send one is next (it will be reference for next node data)
//head point to first data last node next element point null (no ref)-this is called singly linked list


//Head ->data|next->data|next
public class LinkedListConcept {
	
	public static void main(String[] args)
	{
		
	LinkedList<String> ll=new LinkedList<String>();
	
	ll.add("tom");
	ll.add("peter");
	ll.add("max");
	ll.add("micky");
	 System.out.println(ll);
	 
	 ll.addFirst("nike");
	 ll.addLast("testing");
	 System.out.println(ll);
	
	System.out.println(ll.get(3));
	
	
	ll.set(0,"selenium");//set selenium based on index
	System.out.println(ll.get(0));
	
	System.out.println("-----------------------------");
	
//	ll.removeFirst();remove first element
//	ll.removeLast(); remove last element
	//ll.remove(2);//remove based on index
	//how to print linked list
	
	//first way using for loop
	for(int i=0;i<ll.size();i++)
	{
		System.out.println(ll.get(i));
	}
	
	System.out.println("--------------------------------");
	
	//using for each
	for(String x:ll)
	{
		System.out.println(x);
	}
	
	//using iterator
	//using iterator
	System.out.println("===============================");
	
Iterator<String> itr=ll.iterator();

while(itr.hasNext()) {
	String str=itr.next();
	System.out.println(str);
}
	System.out.println("===============");
	//using while loop
	int num=0;
	while(num<ll.size())
	{
		System.out.println(ll.get(num));
		num++;
	}
}
	
	
	
}
