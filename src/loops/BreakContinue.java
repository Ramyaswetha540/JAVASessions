package loops;

public class BreakContinue {
	
	public static void main(String[] args)
	{
		int i=0;
		while(i<10)
		{
			i=i+1;
			if(i==5)
			{
		//break; if you give break it will print up to 4 only if you want to continue further 
			continue;	//it will continue after 4 if will not print i value 5 it will continue go to while loop and start execution
			
			}
			System.out.println(i);
		}
	}

}
