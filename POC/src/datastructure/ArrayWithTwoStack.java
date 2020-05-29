/**
 * 
 */
package datastructure;

import java.util.Arrays;

/**
 * @author Tanmoy Dasgupta
 * @date Apr 12, 2019
 */
public class ArrayWithTwoStack {

	int size;
	int top1,top2;
	int[] arr;

	public ArrayWithTwoStack(int n) {
		size = n;
		arr = new int[n];
		top1 = -1;
		top2 = n;
	}

	private void printArray() {
		System.out.println(Arrays.toString(arr));
	}
	private void push1(int val) {
		if(top1<top2 -1) {
			top1++;
			arr[top1] = val;
		} else
		{ 
			System.out.println("Stack Overflow"); 
			System.exit(1); 
		} 
	}
	

	private void push2(int val) {
		if(top1<top2 -1) {
			top2--;
			arr[top2] = val;
		} else
		{ 
			System.out.println("Stack Overflow"); 
			System.exit(1); 
		} 
	}

	public static void main(String[] args) {
		ArrayWithTwoStack obj = new ArrayWithTwoStack(10);
		obj.push1(10);
		obj.push2(3);
		obj.push2(5);
		obj.push2(18);
		obj.push1(33);
		obj.push1(44);
		obj.push2(20);

		obj.printArray();
			
	}

}
