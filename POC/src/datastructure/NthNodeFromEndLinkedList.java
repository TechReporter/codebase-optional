package datastructure;

public class NthNodeFromEndLinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void KthNodeFromEnd(int k) {

		Node pointer1 = head;
		Node pointer2 = head;

		int counter = 0;
		if(head!=null) {

			while(counter<k) {
				pointer1 = pointer1.next;
				counter++;
			}

			while(pointer1 !=null) {
				pointer1 = pointer1.next;
				pointer2 = pointer2.next;
				counter++;
			}
			System.out.println("data ::"+pointer2.data+" position ferom beginning ::"+counter);

		}
	}

	public void push(int new_data) 
	{ 
		Node new_node = new Node(new_data); 
		new_node.next = head; 
		head = new_node; 
	} 

	public static void main(String[] args) {
		NthNodeFromEndLinkedList llist = new NthNodeFromEndLinkedList(); 
		llist.push(20); 
		llist.push(4); 
		llist.push(15); 
		llist.push(35); 

		llist.KthNodeFromEnd(4); 
	}

}
