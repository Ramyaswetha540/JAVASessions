package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	
	public static void main(String[] args)
	{
		//int a[]=new int[3]; it is static array here it stores up to 3 emenents if you can add one more there will be no memory r no address for that added element
		//arraylist is dyanamic here we can store as many elements you want 
		//it can create dulpicate elements/values
		//it maintains insertion order
		//it is not synchronized
		//as it stores the elements in insertion order using index it is easy to fetch the value/element for the list will be easy-random acess to fetch data
		
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		ar.add(10);
		ar.add(300);
		ar.add(40);
		System.out.println(ar.size());
		ar.add(20);
		ar.add(50);
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		
		//in this array you can store any data types in order to store specific datatype you need to mention the generics
		//like<Integer>-this indicates the array list will only store int values
		//if you try to store other data type it will not allow
		
		//ar.add("selenium"); this is not allowed
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		         //<E>-for all data types
		ar1.add(12);
		ar1.add(20);
		ar1.add(87);
		ar1.add(30);
		
		ar.add(5,100);
		ar.remove(0);
		System.out.println(ar.contains(20));
		System.out.println(ar.indexOf(100));
		
		System.out.println(ar.subList(1, 2));
		System.out.println("-----------------------");
		
		System.out.println(ar.addAll(3, ar1));
		
		
		System.out.println(ar1.get(0));
		
		System.out.println("----------------------");
		//to print all the vlaues of arraylist
		//1.using for each
		for(int x:ar)
		{
			System.out.println(x);
		}
		
		System.out.println("--------------------------------------");
		//2.forloop
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println("----------------------------");
		
		//3.using iterator
		
		Iterator <Integer> itr=ar.iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			System.out.println(i);
		}
		
		System.out.println("----------------------------------");
		
		ArrayList<String> ar2=new ArrayList<String>();
		
		ar2.add("tom");
		ar2.add("peter");
		ar2.add("max");
		ar2.add("john");
		ar2.add("tommy");
		
		ArrayList<String> ar3=new ArrayList<String>();
		ar3.add("tam");
		ar3.add("peters");
		ar3.add("maxy");
		ar3.add("johny");
		ar3.add("tommys");
		ar3.add("peter");
		ar3.add("john");
		
		ar2.addAll(ar3);//adding ar3 values to ar2
		for(int k=0;k<ar2.size();k++)
		{
			System.out.println(ar2.get(k));
		}
		System.out.println("-------------------");
		ar2.removeAll(ar3);//remove ar3 from ar2
		for(int k=0;k<ar2.size();k++)
		{
			System.out.println(ar2.get(k));
		}
		
		ar2.retainAll(ar3);//common elements are displayed
		for(int k=0;k<ar2.size();k++)
		{
			System.out.println(ar2.get(k));
		}
		
	}

}
