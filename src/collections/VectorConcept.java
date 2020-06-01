package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//1 synchronization:Vector is synchronized, which means only one thread at a time can access the code, while arrayList is not synchronized,
//which means multiple threads can work on arrayList at the same time
//2 performance:ArrayList is faster, since it is non-synchronized, while vector operations give slower performance since they are synchronized (thread-safe). If one thread works on a vector, it has acquired a lock on it, which forces any other 
//thread wanting to work on it to have to wait until the lock is released.
//3 Data size:ArrayList and Vector both grow and shrink dynamically to maintain optimal use of storage – but the way they resize is different. ArrayList increments 50% of the current array size if the number of elements exceeds its capacity, while 
//vector increments 100% – essentially doubling the current array size.
//4.Traversal:Vector can use both Enumeration and Iterator for traversing over elements of vector 
//while ArrayList can only use Iterator for traversing.
public class VectorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Vector<String> v=new Vector<String>();
	
	v.add("tom");
	v.add("peter");
	v.add("max");
	v.add("kim");
	v.add("tim");
	
	System.out.println(v.firstElement());
	
	System.out.println("------------------");
//	for(String x:v)
//	{
//		System.out.println(v);
//	}
//	//using ITerator
	Iterator<String> itr=v.iterator();
	while(itr.hasNext())
	{
		String str=itr.next();
		System.out.println(str);
	}
	
	System.out.println("===============");
	//using Enumeration
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("------------------");
		
		v.insertElementAt("pink", 4);
		
		Iterator<String> itr1=v.iterator();
		while(itr1.hasNext())
		{
			String str=itr1.next();
			System.out.println(str);//it will not print in order
		}
		
		
	}

}
