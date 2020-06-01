package patterns;

public class Pattern1 {
		
	public static void pattern()
	{
		
		for(int m=0;m<=3;m++ )
		{
			for(int n=0;n<=m;n++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
	public static void example()
	{
		
		int k=1;
		while(k<=5)
		{
			int l=0;
			if(l<=k)
			{
			System.out.print("*");
			l=l+1;
			}
			System.out.println(" ");
			k++;
		}
			}
	
	public static void main(String[] args)
	{
		
		pattern();
		System.out.println("==================");
		example();
		System.out.println("==================");
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println(" ");
		i++;
		}
		
	}
	
	

}
