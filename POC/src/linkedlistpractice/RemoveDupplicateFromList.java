package linkedlistpractice;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 212720190
 * @date Jan 19, 2020
 */
public class RemoveDupplicateFromList {
	static Node head;
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	static Node removeDuplicate(Node head) {
		Set<Integer> set = new HashSet<>();
		Node curr = head;
		Node prev=null;
		while(curr!=null && curr.next!=null) {
			if(set.contains(curr.data)) {
				prev.next=curr.next;
				curr = curr.next;
			}
			else {
				set.add(curr.data);
				prev=curr;
				curr=curr.next;
			}
		}
		return head;
	}
	
	public static void printList(Node head) 
	{ 
		Node tnode = head; 
		while (tnode != null) 
		{ 
			System.out.print(tnode.data+" "); 
			tnode = tnode.next; 
		}
	}
	
	public static void main(String[] args) {
		head = new Node(5);
		head.next = new Node(10);
		head.next.next = new Node(20);
		head.next.next.next = new Node(10);
		head.next.next.next.next = new Node(30);
		head.next.next.next.next.next = new Node(5);
		head.next.next.next.next.next.next = new Node(50);
		head.next.next.next.next.next.next.next = new Node(10);
		head.next.next.next.next.next.next.next.next = new Node(20);
		printList(head);
		System.out.println("=========");
		printList(removeDuplicate(head));
	}

}
