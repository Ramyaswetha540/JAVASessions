package javainterviewprograms;

public class Swapping {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int t;
		
		t=a;//t=10
		a=b;//a=20
		b=t;//b=10
		
		
		//2nd way using +
		
		int x=20;
		int y=30;
		
		x=x+y;//x=50
		y=x-y;//y=50-30=20
		x=x-y;//50-20=30
		
		//3 rd way
		
		int m=20;
		int n=30;
		
		m=m*n;//m=20*30=600
		n=m/n;//n=600/30=20
		m=m/n;//600/20=30		

		//4.XOR
		
		int p=20;
		int q=25;
		
		p=p^q;
		q=p^q;
		p=p^q;
		
		System.out.println(p);
		System.out.println(q);
		
		
		
	}

}
