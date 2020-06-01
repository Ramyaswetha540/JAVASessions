package collections;
//push-data is pushed top to bottom
//pop-data is fetched based on FILO and Removes and returns the top element of the stack.
//isEmpty  It returns true if nothing is on the top of the stack. Else, returns false. 
//isFull  It determines whether an object exists in the stack. If the element is found, it returns the position of the element from the top of the stack. 
//Else, it returns -1.
//peek- Returns the element on the top of the stack, but does not remove it.
import java.util.Iterator;
import java.util.Stack;

public class StackConcept {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>(); 
		
		//stack.pop();//stack is empty //we get java.util.EmptyStackException
		System.out.println("=====================");
		
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		
		//stack.pop(); //here no exception because stack contains data now
		System.out.println("================");
		//Iterator to print 
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
		
	
		
	}

}
