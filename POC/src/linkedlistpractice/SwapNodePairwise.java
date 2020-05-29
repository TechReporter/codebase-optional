package linkedlistpractice;

/**
 * @author 212720190
 * @date Jan 19, 2020
 */
//only data swap is fine
public class SwapNodePairwise {
	static Node head;
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next=null;
		}
	}

	static Node swapPair(Node head) {

		if(head==null) {
			return null;
		}
		Node curr = head;
		while(curr!=null && curr.next!=null) {
			int temp = curr.data;
			curr.data = curr.next.data;
			curr.next.data = temp;
			curr= curr.next.next;
		}
		return head;
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
		head.next = new Node(12);
		head.next.next = new Node(7);
		head.next.next.next = new Node(2);
		head.next.next.next.next = new Node(20);
		printList(head);
		System.out.println("=======");
		printList(swapPair(head));
	}

}
