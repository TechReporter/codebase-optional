/**
 * 
 */
package linkedlistpractice;

/**
 * @author 212720190
 * @date Mar 11, 2020
 */
public class DeleteEveryKthNode {
	static Node head;
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	static Node deleteKthNode(int k) {
		if(head==null)
			return null;
		Node curr = head;
		Node prev=null;
		int temp=k-1;
		while(curr!=null && curr.next!=null) {
			if(temp==1) {
				prev=curr;
				curr = curr.next;
				prev.next=curr.next;
				temp=k-1;
			} else {
				curr = curr.next;
				temp--;
			}
			
		}
		return head;
	}
	
	static void addNode(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
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
		addNode(80);
		addNode(50);
		addNode(58);
		addNode(43);
		addNode(90);
		addNode(18);
		
		deleteKthNode(3);
		printList();
	}

}
