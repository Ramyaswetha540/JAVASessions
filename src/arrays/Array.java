package arrays;

public class Array {
	
	 /*int a=10
	 * int a=20 -this is not allowed
	 * a=20 this allowed but it changes the value now a will take 20.so a variable can store only one value 
	 * it cannot store multiple values toovercome this we use arrays
	 * where arrays can store multiple vlaues of similar data types in array variable
	 *in array index starts from 0
	 *int a[]=new int[2];declaration
	 *a[0]=10'
	 a[1]=20
	 a[2]=30
	 
	 lowest index=n-1(n is size of array)
	 
	 disadvantage of array
	 1.size if fixed-static array (u cannot add the values once assigned it is fixed)-to overcome this problem we use collections like Arraylist,hashtable(these are dynamic arrays) 
	 2.It stores only similar data type values in a array(ex-int values int array ,double values double array)
     to overcome this problem we use Object array
	 */
		
	public static void main(String[] args)
	{
		//int a[]={1,2,3} other way of declaring array
		int a[]=new int[5];
		a[0]=50;
		a[1]=60;
		a[2]=0;
		a[3]=10;
		a[4]=21;
		 System.out.println(a[1]);
		// System.out.println(a[5]);//it gives ArrayIndexOutOfBoundexception
		 
		 for(int x:a)
		 {
			 System.out.println(x);
		 }
		 
		 
//object is a super class of all classes in java
		 //Object array
		 
		 Object ob[]=new Object[6];
		 ob[0]="tom";
		 ob[1]=12;
		 ob[2]=12.33;
		 ob[3]=1/1/1990;  
		 ob[4]='m';
		 ob[5]="London";
		
		 System.out.println(ob[5]);
		 System.out.println(ob[1]);
		 System.out.println(ob[2]);
		 System.out.println(ob[0]);
		 System.out.println(ob[3]);
		 System.out.println(ob[4]);
		 System.out.println(ob.length);
		 
		 
		 for(int i=0;i<ob.length;i++)
		 {
			 System.out.println(ob[i]);
		 }
		 
		 
		 
}
}