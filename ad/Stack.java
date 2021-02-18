package ad;

public class Stack{
	private int top;
	private int MAX = 10;
	private int a[] = new int[10];

	public Stack(){
		top = -1;
	}

	public boolean isEmpty(){
		return top < 0;
	}

	public void push(int x){
		if(top >= MAX-1)
			System.out.println("Stack Overflow");
		else	
			a[++top] = x;
	}

	public void pop(){
		if(top < 0)
			System.out.println("error: underflow");
		else
			top--;
	}
	
	public void getTop(){
		System.out.println(a[top]);
	}
}
