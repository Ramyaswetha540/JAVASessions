package arrays;

public class TwodimentionalArray {

	public static void main(String[] args) {
		
		//row and coloum-2d array
		
		String x[][]=new String[3][5];
		
		System.out.println(x.length);//3 -rows
		System.out.println(x[0].length);//5-columns
		
		//store the values
		
		x[0][0]="a";
		x[0][1]="b";
		x[0][2]="c";
		x[0][3]="d";
		x[0][4]="e";
		x[1][0]="f";
		x[1][1]="g";
		x[1][2]="h";
		x[1][3]="i";
		x[1][4]="j";
		x[2][0]="k";
		x[2][1]="l";
		x[2][2]="m";
		x[2][3]="n";
		x[2][4]="o";
		
		
	for(int i=0;i<x.length;i++)
	{
		for(int j=0;j<x[0].length;j++)
		{
			System.out.println(x[i][j]);
		}
	}
	
	System.out.println("==========");
	
	
	System.out.println(x[1][2]);
	

	}
}

