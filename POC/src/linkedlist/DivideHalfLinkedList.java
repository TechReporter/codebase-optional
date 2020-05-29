/**
 * 
 */
package linkedlist;

/**
 * @author 212720190
 * @date Jan 7, 2020
 */
public class DivideHalfLinkedList {

	Node head;
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	static Node divideNode(Node root) {
		if(root==null) {
			return null;
		}
		Node p1 = root;
		Node p2 = root;

		while(p2!=null && p2.next!=null) {
			p2 = p2.next.next;
			p1 = p1.next;
		}
		return p1;
	}

	static void printList(Node node) { 
		while (node != null) { 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
	}

	public static void main(String[] args) {
		DivideHalfLinkedList list = new DivideHalfLinkedList(); 
		list.head = new Node(85); 
		list.head.next = new Node(15); 
		list.head.next.next = new Node(4); 
		list.head.next.next.next = new Node(20);
		list.head.next.next.next.next = new Node(30);
		Node result = divideNode(list.head);
		printList(result);
	}

}
