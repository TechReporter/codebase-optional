/**
 * 
 */
package linkedlist;

/**
 * @author 212720190
 * @date Jul 23, 2019
 */
public class ReverseLinkedList {
	Node head;
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}
	
	Node reverseList(Node node) {
		
		Node prev = null;

		
		while(node !=null) {
			Node next = node.next;
			node.next = prev;
			prev = node;
			node = next;
		}
		return prev;
		
	}
    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
    
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList(); 
		list.head = new Node(85); 
		list.head.next = new Node(15); 
		list.head.next.next = new Node(4); 
		list.head.next.next.next = new Node(20); 
		
		System.out.println("Given Linked list"); 
        list.printList(list.head); 
        Node head1 = list.reverseList(list.head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(head1); 
		
	}

}
