/**
 * 
 */
package linkedlistpractice;

/**
 * @author 212720190
 * @date Mar 25, 2020
 */
public class OddEvenLinkedList {
	static Node head;
	static class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	static Node oddEven(Node root) {
		if(root==null)
			return null;
		Node odd=root;
		Node even = root.next;
		Node evenTmp = even;
		while(even!=null && even.next!=null) {
			odd.next=even.next;
			odd=odd.next;
			even.next=odd.next;
			even=even.next;
		}
		odd.next=evenTmp;
		return root;
	}
	
	
	public static void main(String[] args) {
		head = new Node(5);
		head.next = new Node(10);
		head.next.next = new Node(12);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(17);
		head.next.next.next.next.next = new Node(20);
		head.next.next.next.next.next.next = new Node(22);
		oddEven(head);
	}

}
