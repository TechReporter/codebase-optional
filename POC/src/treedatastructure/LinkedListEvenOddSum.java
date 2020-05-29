package treedatastructure;

/**
 * @author 212720190
 * @date May 25, 2019
 */
public class LinkedListEvenOddSum {

	static Node head;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	  public void push(int new_data) 
	    { 
	        Node new_node = new Node(new_data); 
	        new_node.next = head; 
	        head = new_node; 
	    }
	  
	   static void evenOdd() {
		  int even = 0,odd = 0;
		  Node current = head;
		  while(current != null) {
			  if(current.data %2==0) {
				  even += current.data;
			  } else {
				  odd += current.data;
			  }
			  current = current.next;
		  }
		  System.out.println("even "+even+" odd "+odd);
	  }
	
	public static void main(String[] args) {
		
		LinkedListEvenOddSum llist = new LinkedListEvenOddSum(); 
	 	  
	        llist.push(7); 
	        llist.push(1); 
	        llist.push(3); 
	        llist.push(2); 
	        evenOdd();

	}

}
