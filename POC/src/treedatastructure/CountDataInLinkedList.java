package treedatastructure;

/**
 * @author 212720190
 * @date May 24, 2019
 */
public class CountDataInLinkedList {

	LinkedNode head;

	class LinkedNode {
		int data;
		LinkedNode next;

		public LinkedNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	int countData(int data) {
		LinkedNode current = head;
		int count =0;
		while(current != null) {
			if(current.data == data)
				count++;
			current = current.next;
		}
		return count;
		
	}
	
	public void push(int new_data) 
	{ 
		LinkedNode new_node = new LinkedNode(new_data); 
		new_node.next = head; 
		head = new_node; 
	}
	
	
	public static void main(String[] args) {

		CountDataInLinkedList llist = new CountDataInLinkedList(); 

		llist.push(7); 
		llist.push(1); 
		llist.push(3); 
		llist.push(2); 
		llist.push(4); 
		llist.push(3); 
		llist.push(5); 

		System.out.println(llist.countData(3));
	}

}
