package linkedlistpractice;

/**
 * @author 212720190
 * @date Jan 19, 2020
 */
public class GetMiddleNode {

	static Node head;
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
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
	
	static int getMiddle(Node head) {
		Node p1 = head;
		Node p2 = head.next;
		while(p2 !=null && p2.next !=null) {
			p1 = p1.next;
			p2 = p2.next.next;
		}
		return p1.data;
	}
	
	static void divideTwoHalf(Node head) {
		Node p1 = head;
		Node p2 = head.next;
		while(p2 !=null && p2.next !=null) {
			p1 = p1.next;
			p2 = p2.next.next;
		}
		Node second = p1.next;
		p1.next = null;
		printList(head);
		System.out.println();
		printList(second);

	}

	public static void main(String[] args) {
		head = new Node(5);
		head.next = new Node(10);
		head.next.next = new Node(20);
		head.next.next.next = new Node(30);
		head.next.next.next.next = new Node(40);

		printList(head);
		System.out.println("=========");
		System.out.println(getMiddle(head));
		divideTwoHalf(head);
	}

}
