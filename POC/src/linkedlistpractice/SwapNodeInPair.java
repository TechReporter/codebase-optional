/**
 * 
 */
package linkedlistpractice;

/**
 * @author 212720190
 * @date Mar 25, 2020
 */
public class SwapNodeInPair {
	static Node head;
	static class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	static void NodeSwap(Node head) {
		Node odd = head;
		Node even = head.next;
		while(even!=null && even.next!=null) {
			Node temp = even.next;
			even.next=odd.next;
			odd.next=temp;
			odd=odd.next;
			even=even.next;
		}
	}
	public static void main(String[] args) {

		head = new Node(1);
		head.next = new Node(7);
		head.next.next = new Node(5);
		head.next.next.next = new Node(1);
		head.next.next.next.next = new Node(9);
		head.next.next.next.next.next = new Node(2);
		head.next.next.next.next.next.next = new Node(5);
		NodeSwap(head);
	}

}
