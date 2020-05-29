/**
 * 
 */
package linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 212720190
 * @date Nov 10, 2019
 */
public class FindDuplicateInLinkdList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data=data;
			next=null;
		}
	}
	
	void findDuplicate(Node node) {
		Set<Integer> duplicate = new HashSet<>();
		Node current = node;
		int count=1;
		while(current!=null) {
			if(duplicate.contains(current.data)) {
				count++;
				System.out.println(current.data+" is duplicate");
			}else {
				duplicate.add(current.data);
			}
			current = current.next;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {

		FindDuplicateInLinkdList root = new FindDuplicateInLinkdList();
		root.head = new Node(50);
		root.head.next = new Node(20);
		root.head.next.next = new Node(10);
		root.head.next.next.next = new Node(40);
		root.head.next.next.next.next = new Node(90);
		root.head.next.next.next.next = new Node(40);

		root.findDuplicate(root.head);

	}

}
