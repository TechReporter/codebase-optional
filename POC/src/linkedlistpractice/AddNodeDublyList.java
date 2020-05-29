/**
 * 
 */
package linkedlistpractice;

/**
 * @author 212720190
 * @date Mar 11, 2020
 */
public class AddNodeDublyList {
	static Node head;

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

	Node addNode(int val) {
		if(head==null)
			return null;
		Node curr = head;
		while(curr!=null && curr.left!=null) {
			if(val>=curr.data && val<=curr.left.data) {
				Node node = new Node(val);
				node.left=curr;
				curr.right = node;
			}
			curr = curr.left;
		}
		return head;
	}

	void printList(Node node) {
		while(node !=null) {
			System.out.print(node.data+" ");
			node = node.left;
		}
		System.out.println();
	}

	//add node in sorted doubly linked list
	public static void main(String[] args) {
		AddNodeDublyList obj = new AddNodeDublyList();

		obj.push(10);
		obj.push(20);
		obj.push(17);
		obj.push(7);

		obj.printList(head);
		obj.addNode(19);
		obj.printList(head);


	}

}
