/**
 * 
 */
package datastructure;

import java.util.Stack;

/**
 * @author 212720190
 * @date Feb 5, 2019
 */
public class StackWithQueue {

	/**
	 * make FIFO using LIFO (oldest data always on top)
	 */
	public static void main(String[] args) {
		lastIsFirstVal();
	}

	static void lastIsFirstVal() {
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();

		stack1.push(10);
		stack1.push(20);

		stack1.push(5);
		System.out.println(stack1);

		while (!stack1.isEmpty()) 
        {  
			stack2.push(stack1.pop());  
        }  
		stack1.push(40);  
        while (!stack2.isEmpty())  
        {  
        	stack1.push(stack2.pop());  
        }  
		System.out.println(stack2);
		System.out.println(stack1);

	}
	
	
}
