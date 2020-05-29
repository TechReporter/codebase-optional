package linkedlistpractice;

/**
 * @author 212720190
 * @date Jan 19, 2020
 */
public class SplitLinkedList {
	static Node head;
	static Node second;
	static Node first; 
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	static void splitList(Node head) {
		Node secondCurr = head.next;
		Node firstCurr = head;
		second = secondCurr;
		first = firstCurr;
		head = head.next.next;
		while(head!=null && head.next!=null) {
			firstCurr.next = head;
			secondCurr.next = head.next;
			firstCurr = firstCurr.next;
			secondCurr = secondCurr.next;
			
			head = head.next.next;
		}
		if(head!=null) {
			firstCurr.next = head;
			firstCurr = firstCurr.next;
		}
		firstCurr.next=null;
		secondCurr.next=null;
	}
	
	public static void printList(Node head) 
	{ 
		Node tnode = head; 
		while (tnode != null) 
		{ 
			System.out.print(tnode.data+" "); 
			tnode = tnode.next; 
		}
	}
	
	public static void main(String[] args) {
		head = new Node(5);
		head.next = new Node(10);
		head.next.next = new Node(20);
		head.next.next.next = new Node(55);
		head.next.next.next.next = new Node(33);
		head.next.next.next.next.next = new Node(23);
		head.next.next.next.next.next.next = new Node(34);
		splitList(head);
		printList(first);
		System.out.println("========");
		printList(second);
	}

}
