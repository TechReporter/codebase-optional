package treedatastructure;

/**
 * @author 212720190
 * @date May 24, 2019
 */
public class LinkesdListNodeDelete {

	LinkedNode head;

	class LinkedNode {
		int data;
		LinkedNode next;

		public LinkedNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void deleteNode(int key) {
		LinkedNode curr = head;
		LinkedNode prev = null;


		if(curr !=null && curr.data==key) {
			head = curr.next;
			return;
		}

		while(curr !=null && curr.data !=key) {
			prev = curr;
			curr = curr.next;
		}
		
		prev.next = curr.next;

	}

	public void push(int new_data) 
	{ 
		LinkedNode new_node = new LinkedNode(new_data); 
		new_node.next = head; 
		head = new_node; 
	}
	public void printList() 
	{ 
		LinkedNode tnode = head; 
		while (tnode != null) 
		{ 
			System.out.print(tnode.data+" "); 
			tnode = tnode.next; 
		} 
	} 

	public static void main(String[] args) {
		LinkesdListNodeDelete llist = new LinkesdListNodeDelete(); 

		llist.push(7); 
		llist.push(1); 
		llist.push(3); 
		llist.push(2); 

		System.out.println("\nCreated Linked list is:"); 
		llist.printList(); 

		llist.deleteNode(2);

		System.out.println("\nLinked List after Deletion at position 4:"); 
		llist.printList(); 
	}

}
