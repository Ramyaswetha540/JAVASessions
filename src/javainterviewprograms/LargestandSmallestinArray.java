package javainterviewprograms;

import java.util.Arrays;
//O(n}
public class LargestandSmallestinArray {

	public static void main(String[] args) {
		int num[]= {-10,20,50,80,3};
		
		int largest=num[0];
		int smallest=num[0];
		
		for(int i=1;i<num.length;i++)//stating from index 1 as 0 is already given to largest n smallest
			
		{
			if(num[i]>largest)
			{
				largest=num[i];
			}else if(num[i]<smallest)
			{
	        smallest=num[i];
			}
		}
              System.out.println("array elements"+ Arrays.toString(num));//prints all elements of given array
              System.out.println("largest"+largest);
              System.out.println("smallest"+smallest);
	}

}
