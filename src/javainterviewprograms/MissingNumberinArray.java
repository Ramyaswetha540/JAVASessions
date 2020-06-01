package javainterviewprograms;

public class MissingNumberinArray {

	public static void main(String[] args) {
		//it is done for only when the numbers are in soreted order only
		int a[]={1,2,4,5};
	
		//1+2+3+4+5=15
		//1+2+4+5=12
		//15-12=3 is missing
		
		
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum= sum+a[i];
	}
		System.out.println(sum);
		int sum1=0;
		for(int j=1;j<=5;j++)
		{
			sum1=sum1+j;
		}
		System.out.println(sum1);
		
		System.out.println("missing num:"+(sum1-sum));
	}

}
