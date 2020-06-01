package javainterviewprograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementinArray {

	public static void main(String[] args) {
	
		String names[]= {"john","peter","max","john","jack","peter"};
		
		//compare each element
		//time complexcity-0(n*n)-worse case
		
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)//if i=john,j=peter
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("duplicate num:"+names[i]);
				}
			}
		}
		
	//2.using hashset-it stores unique values O(n)
		
		Set<String> store=new HashSet<String>();
		
		for(String name:names)
		{
			if(store.add(name)==false) //if it is duplicate it will not allowed to add as it gives false 
			{
				System.out.println(name);
			}
		}
	//3.HashMap -duplicate are allowed key n value format//
		
		
		
		
		
		
	}

}
