package loops;

public class Nestforloop {
	
	public static void main(String[] args) {
		
		
//		for(int i=0;i<5;i++)
//		{
//			for(int j=0;j<i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
	
		int k=0;
		while(k<5)
		{
			int l=0;
			
			if(l<=k)
			{
			System.out.print("*");
			}
			
			k++;
		}
		
		System.out.println(" ");
	}
	

}
