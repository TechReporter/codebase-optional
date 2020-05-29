/**
 * 
 */
package tempPractice;

/**
 * @author 212720190
 * @date Apr 13, 2020
 */
public class RemoveDuplicate {

	static Node head;
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
	}
	
	static Node removeDuplicate(Node head) {
		if(head==null)
			return null;
		Node curr=head;
		while(curr.next!=null) {
			Node p=curr.next;
			while(p.next!=null) {
				if(p.next.data==curr.data)
					p.next=p.next.next;
				else
				p=p.next;
			}
			curr=curr.next;
		}
		return head;
	}
	
	//remove duplicate inplace
	public static void main(String[] args) {
		head = new Node(5);
		head.next = new Node(10);
		head.next.next = new Node(20);
		head.next.next.next = new Node(5);
		head.next.next.next.next = new Node(10);
		head.next.next.next.next.next = new Node(40);
		removeDuplicate(head);
	}

}
