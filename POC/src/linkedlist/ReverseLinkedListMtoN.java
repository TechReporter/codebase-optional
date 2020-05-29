package linkedlist;

/**
 * @author 212720190
 * @date Dec 21, 2019
 */

//reverse linkedlist m to n 
//1 2 3 4 5 become 1 3 2 4 5, m=2, n=3
public class ReverseLinkedListMtoN {
	
	Node head;
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	private static Node reverse(int m , int n, Node root) {
		if(root == null) {
			return null;
		}
		Node current = root;
		Node prev = null;
		while(m>1) {
			prev = current;
			current = current.next;
			m--;
			n--;
		}
		
		Node left_pointer = prev;
		Node right_pointer = current;
		
		while(n>0) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			n--;
		}
		if(left_pointer!=null) {
			left_pointer.next = prev;
		}else {
			root = prev;
		}
		right_pointer.next = current;
		return root;
	}
	

    static void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    }
    
	public static void main(String[] args) {

		ReverseLinkedListMtoN list = new ReverseLinkedListMtoN(); 
		list.head = new Node(85); 
		list.head.next = new Node(15); 
		list.head.next.next = new Node(4); 
		list.head.next.next.next = new Node(20); 
		System.out.println(reverse(2, 3, list.head));
		printList(list.head);
	}

}
