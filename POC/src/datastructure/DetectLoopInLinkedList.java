package datastructure;

/**
 * @author 212720190
 * @date Jun 2, 2019
 */
public class DetectLoopInLinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void detectLoop() {
		Node s_pointer = head;
		Node f_pointer = head;
		
		while(s_pointer != null && f_pointer != null && f_pointer.next != null) {
			s_pointer = s_pointer.next;
			f_pointer = f_pointer.next.next;
			if(s_pointer == f_pointer) {
				System.out.println("loop found "+s_pointer.data);
				break;
			}
	
		}
	}
	
	public void push(int new_data) 
	{ 
		Node new_node = new Node(new_data); 
		new_node.next = head; 
		head = new_node; 
	} 

	public static void main(String[] args) {

		DetectLoopInLinkedList llist = new DetectLoopInLinkedList(); 
		llist.push(20); 
		llist.push(4); 
		llist.push(15); 
		llist.push(35);
		llist.push(31);
		llist.push(44);

        llist.head.next.next = llist.head; 

		llist.detectLoop();
	}

}
