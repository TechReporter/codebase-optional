package linkedlist;

/**
 * @author 212720190
 * @date Nov 10, 2019
 */
public class MoveLastNodeToFirst {
	Node head;
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			next=null;
		}
 	}
	
	Node moveNodeBegining(Node node) {
		Node current = node;
        Node secLast = null; 
		while(current.next!=null) {
			secLast = current;
			current = current.next;
		}
		secLast.next=null;
			current.next=head;
			System.out.println();
			return current;
		}
	
	  void printList(Node node) { 
	        while (node != null) { 
	            System.out.print(node.data + " "); 
	            node = node.next; 
	        } 
	    } 
	  
	public static void main(String[] args) {
		MoveLastNodeToFirst list = new MoveLastNodeToFirst(); 
		list.head = new Node(85); 
		list.head.next = new Node(15); 
		list.head.next.next = new Node(4); 
		list.head.next.next.next = new Node(20); 
		list.printList(list.head);
		Node curr = list.moveNodeBegining(list.head);
		list.printList(curr);
	}

}
