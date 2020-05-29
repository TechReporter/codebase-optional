package linkedlist;

/**
 * @author 212720190
 * @date Jan 7, 2020
 */
public class ReverseDoublyLinkedList {
    Node head, tail = null;  
	static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
		}
	}

	static Node reverse(Node root) {
		if(root==null) {
			return null;
		}
		while(root!=null) {
			Node curr = root.next;
			root.next = root.prev;
			root.prev = root;
			root = curr;
		}
		return root;
	}

	void printList(Node node) { 
		while (node != null) { 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
	} 
	public static void main(String[] args) {

		ReverseDoublyLinkedList list = new ReverseDoublyLinkedList(); 
		list.head = new Node(85); 
		list.head.next = new Node(15); 
		list.head.prev = null; 
		list.head.next.next = new Node(4); 
		list.head.next.prev = list.head.next;
		list.head.next.next.next = new Node(20); 
		list.head.next.next.prev = list.head.next.next;

		System.out.println("Given Linked list"); 
		list.printList(list.head); 
		Node head1 = reverse(list.head); 
		System.out.println(""); 
		System.out.println("Reversed linked list "); 
		list.printList(head1); 
	}

}
