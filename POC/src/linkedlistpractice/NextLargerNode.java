/**
 * 
 */
package linkedlistpractice;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Mar 25, 2020
 */
public class NextLargerNode {
	static Node head;
	static int[] arr;
	public NextLargerNode(int n) {
		arr=new int[n];
	}
	static class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	static int listLn(Node head) {
		int l = 0;
        while(head!=null){
        	head = head.next; l++;
        }
        return l;
	}
	
	 static void nextGreaterNode(Node root) {
		Node current = root;
		int k=0;
		while(current.next!=null) {
			Node p1 = current.next;
			while(p1!=null) {
				if(p1.data>current.data) {
					arr[k]=p1.data;
					break;
				}
				p1=p1.next;
			}
			k++;
			current=current.next;
		}
	}

	public static void main(String[] args) {
		head = new Node(1);
		head.next = new Node(7);
		head.next.next = new Node(5);
		head.next.next.next = new Node(1);
		head.next.next.next.next = new Node(9);
		head.next.next.next.next.next = new Node(2);
		head.next.next.next.next.next.next = new Node(5);
		head.next.next.next.next.next.next.next = new Node(1);
		new NextLargerNode(listLn(head));

		nextGreaterNode(head);

		System.out.println(Arrays.toString(arr));

	}

}
