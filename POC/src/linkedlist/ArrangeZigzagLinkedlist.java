package linkedlist;

/**
 * @author 212720190
 * @date Apr 13, 2020
 */
public class ArrangeZigzagLinkedlist {
	static Node head;
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}
	
	static Node zigZag(Node node) {
		if(node==null)
			return null;
		Node curr = node;
		boolean flag=true;
		while(curr.next!=null) {
			if(flag) {
				if(curr.data>curr.next.data) {
					int temp=curr.data;
					curr.data=curr.next.data;
					curr.next.data=temp;
				}
				flag=!flag;
			} else {
				if(curr.data<curr.next.data) {
					int temp=curr.data;
					curr.data=curr.next.data;
					curr.next.data=temp;
				}
				flag=!flag;
			}
			curr=curr.next;
		}
		return node;
	}
	
	public static void main(String[] args) {

		head = new Node(85); 
		head.next = new Node(15); 
		head.next.next = new Node(8); 
		head.next.next.next = new Node(5); 
		head.next.next.next.next = new Node(10); 

	zigZag(head);
	}

}
