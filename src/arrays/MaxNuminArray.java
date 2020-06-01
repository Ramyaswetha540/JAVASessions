package arrays;

public class MaxNuminArray {

	

	public static void main(String[] args) {
	
		int b[]= {100,40,30,12,250,500,350,1,54};
		
          System.out.println(b.length);
          
          int max=b[0];
          int min=b[0];
          
          for(int i=0;i<b.length;i++)
          {
          if(max<b[i])
          {
        	  max=b[i];
          }
          else if(min>b[i])
          {
        	  min=b[i];
           }
          
          }
          System.out.println("the largest num:"+ max +" the smallest num:" + min);
	}
}
