package ad;

public class Stack{
	private int top;
	private int MAX = 3;
	private int a[] = new int[4];

	public Stack(){
		top = -1;
	}

	public boolean isEmpty(){
		return top < 0;
	}

	public void push(int x){
		if(top >= MAX)
			System.out.println("Overflow");
		else	
			a[++top] = x;
	}

	public void pop(){
		if(top < 0)
			System.out.println("Underflow");
		else
			top--;
	}
	
	public void getTop(){
		System.out.println(a[top]);
	}
}
