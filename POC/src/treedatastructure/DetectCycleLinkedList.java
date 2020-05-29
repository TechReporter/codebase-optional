/**
 * 
 */
package treedatastructure;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 212720190
 * @date Jul 28, 2019
 */
public class DetectCycleLinkedList {
	Node head;
	
	static class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	boolean detectLoop(Node node) {
	
		Set<Node> set = new HashSet<>();
		while(node.next !=null) {
			if(set.contains(node)) {
				return true;
			}
			set.add(node);
			node = node.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		DetectCycleLinkedList list = new DetectCycleLinkedList(); 
		list.head = new Node(85); 
		list.head.next = new Node(15); 
		list.head.next.next = new Node(4); 
		list.head.next.next.next = new Node(20); 
		
		list.head.next.next.next = list.head;
		if(list.detectLoop(list.head))
			System.out.println("true");
		else {
			System.out.println("false");
		}
	}
	
	// using floyd algo, keep two poinetr slow, fast. move slow.next, fast.next.next(double speed). 
	//if both pointer meet again loop there.

}
