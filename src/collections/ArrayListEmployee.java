package collections;

//ArrayList storing class objects

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEmployee {
	
	public static void main(String[] args)
	
	{
		//create employee class objects
		
		EmployeeArrayList e1=new EmployeeArrayList("tom",23,"dev");
		EmployeeArrayList e2=new EmployeeArrayList("peter",34,"hr");
		EmployeeArrayList e3=new EmployeeArrayList("max",23,"testing");
		
		//i want to store 3 employee objects in arraylis
		//you need to create a arraylist of employee type generic
		ArrayList<EmployeeArrayList> ar=new ArrayList<EmployeeArrayList>();
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		//iterator -traverse the values here we don't use for loop 
	Iterator<EmployeeArrayList>	itr=ar.iterator();
	while(itr.hasNext())
	{
		EmployeeArrayList emp=itr.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
	}
	
		
		
	}
}
