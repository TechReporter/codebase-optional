/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Apr 11, 2019
 */
public class StackUsingArray {

	static final int size = 10;
	int[] arr = new int[size];
	int top = -1;

	boolean isEmpty() {
		return top < 0;
	}

	boolean push(int x) {
		if(top > size -1) {
			System.out.println("stack overflow");
			return false;
		}
		else {
			arr[++top] = x;
			System.out.println("pushed");
			return true;
		}
	}

	int pop() {
		if(isEmpty()) 
		{
			System.out.println("stack underflow");
			return 0;
		}
		else {
			int x = arr[top--];
			return x;
		}
	}

	int peek() {
		int x = arr[top];
		return x;
	}
	
	public static void main(String[] args) {
		StackUsingArray s = new StackUsingArray(); 
		s.push(10); 
		s.push(20); 
		s.push(30); 

			System.out.println("first"+s.pop());
			System.out.println("second"+s.pop());
			System.out.println(s.peek());


		}
	}

