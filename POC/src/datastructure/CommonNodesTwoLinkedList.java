/**
 * 
 */
package datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212720190
 * @date Jun 2, 2019
 */
public class CommonNodesTwoLinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void findCommonNode(Node h1, Node h2) {
		Node pointer1 = h1;
		Node pointer2 = h2;
		int count =0;
		List<Integer> list = new ArrayList<>();
		while(pointer1 !=null) {
			list.add(pointer1.data);
			pointer1 = pointer1.next;
		}
		while (pointer2 !=null) {
			if(list.contains(pointer2.data))
					count++;
			pointer2 = pointer2.next;
		}

		System.out.println(count);
	}


	public static void main(String[] args) {
		Node head1;
		Node head2;
		CommonNodesTwoLinkedList list = new CommonNodesTwoLinkedList();
		Node n1 = list.new Node(10);
		Node n2 = list.new Node(20);
		Node n3 = list.new Node(30);
		Node n4 = list.new Node(40);

		head1 = n1;
		head1.next = n2;
		head1.next.next = n3;
		head1.next.next.next = n4;

		
		Node n21 = list.new Node(15);
		Node n22 = list.new Node(20);
		Node n23 = list.new Node(30);
		Node n24 = list.new Node(40);

		head2 = n21;
		head2.next = n22;
		head2.next.next = n23;
		head2.next.next.next = n24;
		
		list.findCommonNode(head1,head2); 

	}

}
