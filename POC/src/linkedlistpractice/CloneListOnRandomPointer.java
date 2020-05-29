/**
 * 
 */
package linkedlistpractice;

/**
 * @author 212720190
 * @date Feb 21, 2020
 */
public class CloneListOnRandomPointer {

	Node head;
	
	static class Node {
		int data;
		Node next;
		Node random;
		
		public Node(int data) {
			this.data = data;
		}
		
	}
	
	static Node nodeClone(Node node) {
		if(node==null)
			return null;
		
		Node current = node;
		Node next = null;
		
		while(node!=null) {
			Node newNode = new Node(node.data);
			next = node.next;
			node.next = newNode;
			newNode.next = next;
			node = next;
		}
		node  = current;
		while(node!=null) {
			node.next.random = node.random.next;
			if(node.next!=null) {
				node=node.next.next;
			} else {
				node = node.next;
			}
		}
		
		node = current;
		Node copy = node.next;
		Node temp = copy;
		
		while(node!=null && copy!=null) {
			node.next = node.next!=null?node.next.next:node.next;
			copy.next = copy.next!=null?copy.next.next:copy.next;
			
			node = node.next;
			copy = copy.next;
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		Node head = new Node(5);
		head.next = new Node(12);
		head.next.next = new Node(16);
		head.next.next.next = new Node(20);

		head.random = head.next.next;
		head.next.random = head.next.next.next;
		head.next.next.random = head.next;

		System.out.println(nodeClone(head));
	}

}
