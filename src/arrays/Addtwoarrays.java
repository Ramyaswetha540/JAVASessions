package arrays;

public class Addtwoarrays {
	
	public static void main(String[] args)
	{
		
		int a[][]=new int[3][3];
		 a[0][0]=2;
		 a[0][1]=3;
		 a[0][2]=5;
		 a[1][0]=8;
		 a[1][1]=6;
		 a[1][2]=1;
		 a[2][0]=4;
		 a[2][1]=3;
		 a[2][2]=2;
		 
		 int b[][]=new int[3][3];
		 	 
		 b[0][0]=1;
		 b[0][1]=4;
		 b[0][2]=5;
		 b[1][0]=8;
		 b[1][1]=9;
		 b[1][2]=3;
		 b[2][0]=2;
		 b[2][1]=8;
		 b[2][2]=5;
		 
		 int sum[][]=new int[3][3];
		 		 
		 
		 for(int i=0;i<3;i++)
		 {
			 for (int j=0;j<3;j++)
			 {
				 sum[i][j]=a[i][j]+b[i][j];
				 System.out.println(sum[i][j]);
				 sum[i][j]=a[i][j]-b[i][j];
				 System.out.println(sum[i][j]);
				 sum[i][j]=a[i][j]*b[i][j];
				 System.out.println(sum[i][j]);
				 
			 }
		 }
}
}
