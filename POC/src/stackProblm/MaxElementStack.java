package stackProblm;

import java.util.Stack;

/**
 * @author 212720190
 * @date Jun 9, 2019
 */
//get max element in stack O(1) time and O(1) space

public class MaxElementStack {
	int maxElem;
	Stack<Integer> stack;

	public MaxElementStack() {
		stack = new Stack<>();
	}

	void pushData(int n) {
		if(stack.isEmpty()) {
			stack.push(n);
			maxElem = n;
			System.out.println("item insert "+n);
			return;
		}

		if(n>maxElem) {
			stack.push(2*n-maxElem);
			maxElem = n;
		}
		else
			stack.push(n);
		System.out.println("item insert "+n);
	}

	void peekData() {
		if(stack.isEmpty()) {
			System.out.println("stack empty");
			return;
		}
		if(stack.peek() > maxElem) 
			System.out.print("data on top "+maxElem); 
		else
			System.out.print("data on top "+stack.peek());
	}

	void popData() {
		if(stack.isEmpty()) {
			System.out.println("no element");
			return;
		}
		int data = stack.pop();
		System.out.println("current max elem "+maxElem);
		if(data>maxElem) {
			maxElem = 2*maxElem -data;
		}
		System.out.println("top element removed from stack "+data);
		System.out.println("after pop max element "+maxElem);
	}

	public static void main(String[] args) {


		MaxElementStack s = new MaxElementStack(); 
		s.pushData(3); 
		s.pushData(5); 
		s.popData(); 
		s.pushData(7); 
		s.pushData(19); 
		s.popData(); 
		s.popData(); 
		s.peekData(); 
	}
}
