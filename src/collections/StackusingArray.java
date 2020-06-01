package collections;

//1.PUSH
//2.POP
//3.isEmpty
//4.isFull
//5.Peek
//time complexity 0(1)
public class StackusingArray {
	int size;//stack size
	int arr[];//as we are implementing using array
	int top;//what exactly element avaliable on top
	
	StackusingArray(int size)
	{
		this.size=size;
		this.arr=new int[size];
		this.top=-1;
		
	}
	
	
	
	public void Push(int element)
	{
		if(!isFull())
			
		{
			top++;
			arr[top]=element;
			System.out.println("pushed element"+element);
		}
		else
		{
			System.out.println("stack is full now");
		}
	}
	
	
	public int pop()
	{
		if(!isEmpty())
		{
			int returntop=top;
			top--;
			System.out.println("poped element"+arr[returntop]);
			return arr[returntop];
		}
		else
		{
			System.out.println("stack is empty");
			return -1;
		}
	}
	public int Peek()
	{
		if(!this.isEmpty())
		{
			return arr[top];
		}
		else
			System.out.println("stack is empty");
		return -1;
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}

	public boolean isFull()
	{
		return (size-1==top);
	}
	
	public static void main(String[] args) {
		
		StackusingArray sa=new StackusingArray(6);
		sa.pop();
		System.out.println("==============");
		
		sa.Push(100);
		sa.Push(200);
		sa.Push(300);
		sa.Push(400);
		
		System.out.println("=============");
		sa.pop();//it will remove 400
		
		
	}

}
