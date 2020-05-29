/**
 * 
 */
package linkedlist;

/**
 * @author 212720190
 * @date Jul 22, 2019
 */
public class DoublyLinkedList {

	Node head;

	class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	void push(int k) {
		Node node = new Node(k);
		node.left = head;
		node.right = null;

		if(head !=null) {
			head.right = node;
		}

		head = node;
	}

	void printList(Node node) {
		while(node !=null) {
			System.out.print(node.data+" ");
			node = node.left;
		}
		System.out.println();
	}


	public static void main(String[] args) {

		DoublyLinkedList obj = new DoublyLinkedList();
		
		obj.push(10);
		obj.push(20);
		obj.push(17);
		obj.push(7);

		obj.printList(obj.head);
		
	}

}
