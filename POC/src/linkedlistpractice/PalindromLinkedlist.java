/**
 * 
 */
package linkedlistpractice;

import java.util.Stack;

/**
 * @author 212720190
 * @date Feb 6, 2020
 */
public class PalindromLinkedlist {

	static Node head;
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
		static boolean palindromCheck(Node node) {
			
			if(node==null)
				return true;
			Stack<Node> stk = new Stack<>();
			Node p1=head;
			Node p2=head;
			stk.push(p1);
			while(p2.next!=null && p2.next.next!=null) {
				p1=p1.next;
				p2=p2.next.next;
				stk.push(p1);
			}
			if(p2.next==null)
				stk.pop();
			p1=p1.next;
			while(p1!=null) {
				Node n = stk.pop();
				if(n.data!=p1.data)
					return false;
				p1=p1.next;
			}
			
			return true;
		}
	
	public static void main(String[] args) {
		head = new Node(5);
		head.next = new Node(10);
		head.next.next = new Node(20);
		head.next.next.next = new Node(15);
		head.next.next.next.next = new Node(20);
		head.next.next.next.next.next = new Node(10);
		head.next.next.next.next.next.next = new Node(5);
		System.out.println(palindromCheck(head));
	}

}
