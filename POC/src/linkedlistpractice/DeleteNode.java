package linkedlistpractice;

/**
 * @author 212720190
 * @date Jan 19, 2020
 */
public class DeleteNode {
	static Node head;
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static void addNode(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}

	public static void printList() 
	{ 
		Node tnode = head; 
		while (tnode != null) 
		{ 
			System.out.print(tnode.data+" "); 
			tnode = tnode.next; 
		} 
	}

	public static void deleteFront() {
		head = head.next;	
	}
	
	public static void deleteEnd() {
		Node curr = head;
		Node prev=null;
		while(curr.next!=null) {
			prev=curr;
			curr=curr.next;
		}
		prev.next=curr.next;
	}
	
	public static void deleteMiddle(int val) {
		Node curr = head;
		Node prev=null;
		while(curr.next!=null && curr.data!=val) {
			prev=curr;
			curr=curr.next;
		}
		prev.next=curr.next;
	}

	public static void main(String[] args) {

		addNode(10);
		addNode(20);
		addNode(30);
		addNode(80);
		addNode(50);

		printList();
		System.out.println("---start delete------");
		deleteFront();
		printList();
		System.out.println("-----middle delete----");
		deleteMiddle(30);
		printList();
		System.out.println("------end delete---");
		deleteEnd();
		printList();
	}
}
