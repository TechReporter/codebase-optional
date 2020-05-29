package linkedlistpractice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212720190
 * @date Jan 19, 2020
 */
public class LowestCommonElement {
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	static int lowestCommonNode(Node n2, List<Integer> list) {
		if(n2==null) {
			return -1;
		}
		int min =  Integer.MAX_VALUE;
		while(n2!=null) {
			if(list.contains(n2.data)) {
				min = Math.min(min, n2.data);
			}
			n2=n2.next;
		}
		return min;
	}
	
	static int traverse(Node n1, Node n2) {
		if(n1== null) {
			return -1;
		}
		List<Integer> list = new ArrayList<Integer>();
		
		while(n1!=null) {
			list.add(n1.data);
			n1 = n1.next;
		}
		return lowestCommonNode(n2, list);	
	}

	public static void main(String[] args) {
		Node head = null;
		head = new Node(5);
		head.next = new Node(10);
		head.next.next = new Node(20);
		head.next.next.next = new Node(30);
		head.next.next.next.next = new Node(40);
		
		Node head1 = null;
		head1 = new Node(12);
		head1.next = new Node(27);
		head1.next.next = new Node(20);
		head1.next.next.next = new Node(25);
		head1.next.next.next.next = new Node(10);
		
		System.out.println(traverse(head, head1));
	}

}
