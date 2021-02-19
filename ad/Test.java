package ad;

class Test{

	public static void main(String[] arg){
	Queue q = new Queue();
		q.dequeue();
		q.enqueue(10);
		System.out.println(q.getHead());
		q.dequeue();
		q.enqueue(13);
		q.enqueue(33);
		q.enqueue(46);
		q.enqueue(36);
		q.enqueue(56);
	}
};

	/*
	Stack s = new Stack();
		s.push(33);
		s.getTop();
		
		for(int i=0; i<4; i++)
			s.push(73+i);

		s.getTop();
		for(int i=0; i<5; i++)
			s.pop();

		s.push(76);
		s.getTop();
	}
	*/
