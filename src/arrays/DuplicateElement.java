package arrays;

public class DuplicateElement {

	public static void main(String[] args) {
		 int a[]=new int[4];
		 a[0]=50;
		 a[1]=20;
		 a[2]=30;
		 a[3]=50;
		 
		 System.out.println(a.length);
		 
		 for(int i=0;i<=a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]==a[j])
				 {
					 System.out.println("the dupliacte num is:"+a[i]);
				 }
			 }
		 }
	}
	
}

