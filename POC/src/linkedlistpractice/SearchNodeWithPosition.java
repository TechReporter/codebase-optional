/**
 * 
 */
package linkedlistpractice;

/**
 * @author 212720190
 * @date Jan 19, 2020
 */
public class SearchNodeWithPosition {

	static Node head;
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	static boolean positionNode(Node node, int val) {
		Node curr = node;
		int pos=1;
		while(curr.next!=null && curr.data!=val) {
			curr = curr.next;
			pos++;
		}
		if(curr.data==val) {
			System.out.println("position : "+pos);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		head = new Node(5);
		head.next = new Node(10);
		head.next.next = new Node(20);
		head.next.next.next = new Node(30);
		head.next.next.next.next = new Node(40);

		
		System.out.println(positionNode(head,30));

	}

}
