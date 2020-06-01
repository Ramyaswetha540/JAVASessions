package collections;

import java.util.HashMap;

import java.util.Map.Entry;

public class HashMapEmployee {
//Entry set
	public static void main(String[] args) {
		
		//how to create class objects in haspmap and display all the elements using key and value
		 //example take Employee class which is already created
		 //first create one more haspmap object of key=integer value=employee
		 
		//employee type -because it contains the details of all employee as we required employee details we need to mention employee as a value
		 //hashmap object should be created based on key and value here key is integer value is Employee time
		 HashMap<Integer,EmployeeArrayList> hm=new HashMap<Integer,EmployeeArrayList>();
		 
		 //create employee objects as we did in array list concept
		 
		 EmployeeArrayList e1=new EmployeeArrayList("tom",27,"java");
		 EmployeeArrayList e2=new EmployeeArrayList("jack",23,"qtp");
		 EmployeeArrayList e3=new EmployeeArrayList("jim",27,"rft");
		 EmployeeArrayList e4=new EmployeeArrayList("john",27,"javascript");
		 EmployeeArrayList e5=new EmployeeArrayList("max",27,"c#");
		 
		 
		 //now we need to put employess objects to hashmap
		 
		 hm.put(1,e1);
		 hm.put(2,e2);
		 hm.put(3,e3);
		 hm.put(4,e4);
		 hm.put(5,e5);
		 //to traverse we need to use advance for loop
		 
		 
		 
		 for(Entry<Integer,EmployeeArrayList> m :hm.entrySet()) {
			 
			 //get key getkey()
			int key= m.getKey();
			EmployeeArrayList e=m.getValue();
			
	
			System.out.println("employee"+" "+key+" "+"info:");//printing key values
		
			System.out.println(e.name+" "+e.age+" "+e.dept);//as the complete entry set of employee details is stored in e
		 }

	}

}
