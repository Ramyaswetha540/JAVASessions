package condition;

public class Switchcase {

	public static void main(String[] args) {
		
   int day=4;	
   switch(day)
   {
	   case 1:
		   System.out.println("monday");
		   break;
	   case 2:
		   System.out.println("tuesday");
		   break;
	   case 3:
		   System.out.println("wednusday");
		   break;
	   case 4:
		   System.out.println("thrusday");
		   break;//if we dont put break then it will also execute remain
	   case 5:
		   System.out.println("friday");
		   break;
	   default:
		System.out.println("invalid");
		break;
   }
	}

}
