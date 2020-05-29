/**
 * 
 */
package linkedlistpractice;

/**
 * @author 212720190
 * @date Jan 19, 2020
 */
public class AddNewNodeToEnd {
	static Node head;
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static void addNode(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}

	static void addNodeToMidlle(int val, int val1) {
		Node curr = head;
		while(curr.next!=null && curr.data!=val) {
			curr = curr.next;
		}
		Node newNode = new Node(val1);
		newNode.next = curr.next;
		curr.next = newNode;
	}

	static void addNodeToEnd(int val) {
		Node newNode = new Node(val);
		Node curr = head;
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}

	public static void printList() 
	{ 
		Node tnode = head; 
		while (tnode != null) 
		{ 
			System.out.print(tnode.data+" "); 
			tnode = tnode.next; 
		} 
	}

	public static void main(String[] args) {

		addNode(10);
		addNode(20);
		addNode(30);

		printList();
		System.out.println("add a node end");
		addNodeToEnd(44);
		printList();

		System.out.println("add a node begin");
		addNode(50);
		printList();

		addNodeToMidlle(30, 74);
		System.out.println("add a node middle");
		printList();

	}

}
