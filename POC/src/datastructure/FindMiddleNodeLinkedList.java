/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Jun 2, 2019
 */
public class FindMiddleNodeLinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void findMiddleNode() {
		Node pointer1 = head;
		Node pointer2 = head;
		
		while(pointer1 != null && pointer1.next != null) {
			pointer2 = pointer2.next;
			if(pointer1.next != null) {
				pointer1 = pointer1.next.next;
			}
		}
		System.out.println(pointer2.data);
	}

	public void push(int new_data) 
	{ 
		Node new_node = new Node(new_data); 
		new_node.next = head; 
		head = new_node; 
	} 

	public static void main(String[] args) {
		FindMiddleNodeLinkedList llist = new FindMiddleNodeLinkedList(); 
		llist.push(20); 
		llist.push(4); 
		llist.push(15); 
		llist.push(35); 
		llist.push(40); 
		llist.push(17); 
		llist.push(18); 

		llist.findMiddleNode(); 
	}

}
