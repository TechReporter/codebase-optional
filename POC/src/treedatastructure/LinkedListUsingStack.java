/**
 * 
 */
package treedatastructure;

import java.util.Stack;

/**
 * @author 212720190
 * @date Apr 5, 2019
 */
public class LinkedListUsingStack {
	static Node head = null;

	static class Node { 
		int data;
		Node next;
	}
	static void push(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}
	
	static Node reverseList(Node head) {
		Stack<Node> stack = new Stack<>();
		Node ptr = head;
		while(ptr.next != null) {
			stack.push(ptr);
			ptr = ptr.next;
		}
		
		head = ptr;
		while(!stack.isEmpty()) {
			ptr.next = stack.peek();
			ptr = ptr.next;
			stack.pop();
		}
		ptr.next = null;
		return head;
	}
	
	static void printList(Node head)  
	{  
	    while (head != null)  
	    {  
	        System.out.print(head.data + " ");  
	        head = head.next;  
	    }  
	}
	
	
	public static void main(String[] args) {
		 
	    push( 1);  	
	    push( 5);  
	    push( 4);  
	    push( 3);  
	    push( 2); 
	  
	    head = reverseList(head);  
	  
	    printList(head);  
	}

}
