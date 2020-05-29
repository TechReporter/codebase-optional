package linkedlist;

/**
 * @author 212720190
 * @date Aug 10, 2019
 */
public class KthNodeFromEndLinkedList {

	Node head;
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}
	
	static void findKthnodeEnd(Node node, int n) {
		Node pointer1=node,pointer2=node;
		int count=0;
		while(count<n-1) {
			pointer1 = pointer1.next;
			count++;
		}
		
		while(pointer1.next!=null) {
			pointer1 = pointer1.next;
			pointer2 = pointer2.next;
		}
		
		System.out.println(pointer2.data);
		
	}
	
	public static void main(String[] args) {
		KthNodeFromEndLinkedList list = new KthNodeFromEndLinkedList(); 
		list.head = new Node(85); 
		list.head.next = new Node(15); 
		list.head.next.next = new Node(4); 
		list.head.next.next.next = new Node(20); 
		
		findKthnodeEnd(list.head,3);
		
	}

}
