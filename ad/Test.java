package ad;

class Test{

	public static void main(String[] arg){
	Queue q = new Queue();
		q.dequeue();
		q.enqueue(10);
		System.out.println(q.getHead());
		System.out.println(q.getTail());
		q.dequeue();
		q.dequeue();
		q.enqueue(13);
		q.enqueue(33);
		q.enqueue(46);
		q.enqueue(46);
	}
}
