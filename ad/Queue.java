package ad;

public class Queue{
	private static int head; 
	private static int tail;
	private static int q[];
	
	public Queue(){
		head = tail = 0;	
		q = new int[4];
	}

	public void enqueue(int x){
		if(!this.isFull()){
			if(tail < q.length){
				q[tail] = x;	
				tail++;
			}
			else 
				tail = 0;
		}
		else
			System.out.println("overflow");
	}
	
	public void dequeue(){
		if(!isEmpty()){
			int x = q[head];
			if (head < q.length)
				head++;
			else
				head = 0;
		}
		else
			System.out.println("underflow");
	}

	public int getHead(){
		return q[head];
	}

	public int getTail(){
		return tail;
	}

	private boolean isEmpty(){
		return head == tail;
	}

	private boolean isFull(){
		if(head == tail + 1)
			return true;
		return false;
	}
}
