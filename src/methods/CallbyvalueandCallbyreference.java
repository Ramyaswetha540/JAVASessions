package methods;

public class CallbyvalueandCallbyreference {
//create global variables for callbyreference method
	int p;
	int q;
	
	
//callbyreference is possible in java
	//call be value
	public int sum(int a,int b)
	{
		
		 a=30;//this will not effect on x n y values 
		 b=40;
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
	
		CallbyvalueandCallbyreference ob=new CallbyvalueandCallbyreference();
	//	ob.sum(10,20);// or
		
		int x=10;
		int y=20;
		
		ob.sum(x, y);//this means a copy of x & y values(not original values) are given to a & b i.e 10,20// call by value r pass by value
		
		ob.p=50;
		ob.q=60;
		
		ob.sum(ob);//we need to pass object  now ob and t both ref to object both can access p and q values
        System.out.println(ob.p);
        System.out.println(ob.q);
	}
	// call by reference
	public void sum(CallbyvalueandCallbyreference t) {
	
		int temp;
		temp=t.p;//50
		t.p=t.q;//60
		t.q=temp;//50// now new values of p=60 q=50
		
		
	}

	

}
