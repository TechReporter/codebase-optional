package stackProblm;

import java.util.Stack;

/**
 * @author 212720190
 * @date Jun 9, 2019
 */
public class QueueUsingStack<E> {

	Stack<E> s1;
	Stack<E> s2;

	public QueueUsingStack() {
		super();
		this.s1 = new Stack<>();
		this.s2 = new Stack<>();
	}

	void enqueueCostly(E data) {
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}

		s1.push(data);
		while(!s2.empty()) {
			s1.push(s2.pop());
		}
	}
	
	void topItem() {
		System.out.println("top item "+s1.peek());
	}
	
	void enqueue(E data) {
		s1.push(data);
		System.out.println("item pushed "+s1.peek());
	}

	public E dequeue() {
		if (s1.isEmpty()) {
			System.out.println("Underflow!!");
			System.exit(-1);
		}
		return s1.pop();
	}
	
	public E costlydequeue() {
		if (s2.isEmpty() && s1.isEmpty()) {
			System.out.println("Underflow!!");
			System.exit(-1);
		}
		while(!s1.empty()) {
			s2.push(s1.pop());
		}
		return s2.pop();
	}

	public static void main(String[] args) {

		int[] keys = { 1, 2, 3, 4, 5 };
		QueueUsingStack<Object> q = new QueueUsingStack<>();

		for (int key : keys) {
			q.enqueue(key);
		}
		
		q.topItem();

		System.out.println(q.costlydequeue());
		System.out.println(q.costlydequeue());
		System.out.println(q.costlydequeue());

	}

}
