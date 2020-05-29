/**
 * 
 */
package stackProblm;

/**
 * @author 212720190
 * @date Mar 21, 2020
 */
public class StackDesign {

	//1381. Design a Stack With Increment Operation
	//Implement the CustomStack class:

	/*CustomStack(int maxSize) Initializes the object with maxSize which is the maximum number
		of elements in the stack or do nothing if the stack reached the maxSize.
		void push(int x) Adds x to the top of the stack if the stack hasn't reached the maxSize.
		int pop() Pops and returns the top of stack or -1 if the stack is empty.
		void inc(int k, int val) Increments the bottom k elements of the stack by val. If there are less than 
		k elements in the stack, just increment all the elements in the stack.*/

	int[] arr;
	int maxSize;
	int top;

	public StackDesign(int size) {
		top=0;
		this.maxSize=size;
		arr = new int[maxSize];
	}

	public void push(int x) {
		if(top<arr.length) {
			arr[top++]=x;
		}
	}

	public int pop() {
		if(top==0) {
			return -1;
		} else {
			return arr[--top];
		}
	}

	public void increment(int k, int val) {
		if(k>arr.length) {
			for(int i=0;i<arr.length;i++) {
				arr[i]+=val;
			} 
		} else {
			for(int i=0;i<k;i++) {
				arr[i]+=val;
			}
		}
	}


	public static void main(String[] args) {
		 StackDesign obj = new StackDesign(3);
		 obj.push(1);
		 obj.push(2);
		 System.out.println(obj.pop());
		 obj.push(2);
		 obj.push(3);
		 obj.push(4);
		 obj.increment(5,100);
		 obj.increment(2, 100);
		 System.out.println(obj.pop());
		 System.out.println(obj.pop());
		 System.out.println(obj.pop());
		 System.out.println(obj.pop());

	}

}
