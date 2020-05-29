package hackerrank;

/**
 * @author 212720190
 * @date May 16, 2019
 */
public class ReverseLinkedList {

	static Node head;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	static Node listReverse(Node node) {
		Node prevP = null;
		Node currentP = node;
		Node nextP = null;
		
		while(currentP != null) {
			nextP = currentP.next;
			currentP.next = prevP;
			prevP = currentP;
			currentP = nextP;
		}
		node = prevP;
		return node;	
	}
	
	static void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
	
	
	public static void main(String[] args) {

		ReverseLinkedList.head = new Node(85); 
		ReverseLinkedList.head.next = new Node(15); 
		ReverseLinkedList.head.next.next = new Node(4); 
        ReverseLinkedList.head.next.next.next = new Node(20); 
          
        System.out.println("Given Linked list"); 
        ReverseLinkedList.printList(head); 
        head = ReverseLinkedList.listReverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        ReverseLinkedList.printList(head); 
	}

}
