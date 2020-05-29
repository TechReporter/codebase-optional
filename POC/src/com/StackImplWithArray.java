package com;

public class StackImplWithArray {

	public static void main(String[] args) {

		StackImplWithArray obj = new StackImplWithArray();
		obj.push(10);
		System.out.println("---------");
		obj.push(120);
		System.out.println("---------");
		obj.push(30);
		System.out.println("---------");
		obj.pop();
		System.out.println("---------");
		obj.getElementFromStack();
		System.out.println("---------");
		obj.push(60);
		
	}
	int[] arr = new int[10];
	int top = -1;
	private void push(int val) {
		if(top<arr.length) {
			top++;
			arr[top] = val;
			getElementFromStack();
		}
	}
	
	private void pop() {
		if(top>0) {
			System.out.println(arr[top]);
			top--;
		}
	}
	
	private void getElementFromStack() {
		if(top >=0) {
				for(int i=0; i<=top;i++) {
					System.out.println(arr[i]);
				}
		}
	}

}
