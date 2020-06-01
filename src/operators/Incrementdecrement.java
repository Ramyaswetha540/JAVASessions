package operators;

public class Incrementdecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j=i++;//post increment//here first the j will store i value i.e 1 later it will add 1 but not store in j it displays 1
		System.out.println(j);//j=1 given then increment
		System.out.println(i);//i=2
		
		int a=1;
		int b=++a;//preincrement//in this first b stores a+1 i.e 1+1=2 
		System.out.println(a);//a=2
        System.out.println(b);//b=2
      int m=2;
	  int n=m--;
	  System.out.println(m);//1
	  System.out.println(n);//2
	  
	  int p=2;
	  int q=--p;
	  System.out.println(p);//1
	  System.out.println(q);//1
	}

	}


