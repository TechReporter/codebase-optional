package linkedlistpractice;

import linkedlistpractice.GetMiddleNode.Node;

/**
 * @author 212720190
 * @date Jan 19, 2020
 */
//for sort linked list prefer merge sort
public class SortLinkedList {

	static Node head;
	static class Node {
		int data;
		Node next;

		public Node() {
			
		}
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
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
	
	static Node divideTwoHalf(Node head) {
		Node p1 = head;
		Node p2 = head.next;
		while(p2 !=null && p2.next !=null) {
			p1 = p1.next;
			p2 = p2.next.next;
		}
		return p1;
	}
	
	static Node sort(Node node) {
		if(node==null || node.next==null) {
			return node;
		}
		
		Node first = divideTwoHalf(node);
		Node second = first.next;
		first.next = null;
		return mergeList(divideTwoHalf(node), divideTwoHalf(second));
	}
	
	static Node mergeList(Node a1, Node b1) {
	
		Node temp = new Node();
		Node sortList = temp;
		if(a1.data<b1.data) {
			temp.next = a1;
			a1 = a1.next;
		} else {
			temp.next = b1;
			b1 = b1.next;
		}
		temp = temp.next;
		temp.next = (a1==null)?b1:a1;
		return sortList.next;
	}
	
	public static void main(String[] args) {

		head = new Node(5);
		head.next = new Node(12);
		head.next.next = new Node(7);
		head.next.next.next = new Node(2);
		head.next.next.next.next = new Node(20);
		
		printList(sort(head));
		
	}
}
