package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterating {

	public static void main(String[] args) {
		
		ArrayList<String> course=new ArrayList<String>();
		course.add("selenium");
		course.add("java");
		course.add("c");
		course.add("javascript");
		//1.using java 8 with for each loop and lambda  expression
		
		course.forEach(testing->
		{
			System.out.println(testing);
		});
		System.out.println("----------------------");
		//2.using iterator
		
		Iterator<String> itr=course.iterator();
		
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
		}
		//3.using iterator and java 8 lambda and forEachRemaining()
		
		System.out.println("=============");
		
		itr=course.iterator();
		itr.forEachRemaining(test->{
			System.out.println(test);
		});
		System.out.println("=============");
		//4.using for each loop
		for(String x:course)
		{
			System.out.println(x);
		}
		System.out.println("------------------------");
		//5.using for loop
		
		for(int i=0;i<course.size();i++)
		{
			System.out.println(course.get(i));
		}
		
		System.out.println("--------------");
		//6. using listIterator() to traverse  in both directions
		
		ListIterator<String> s1=course.listIterator(course.size());
		while(s1.hasPrevious())
		{
			String str1=s1.previous();
			System.out.println(str1);
		}
		
		
	}

}
