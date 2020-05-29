/**
 * 
 */
package linkedlistpractice;

import java.util.PriorityQueue;

/**
 * @author 212720190
 * @date Mar 11, 2020
 */
public class MergeKsortedLinkedlist {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	static Node mergeList(Node arr[], int k) {
        Node head = null, last = null;
        PriorityQueue<Node> q = new PriorityQueue<>((a,b)->a.data-b.data);
        for(int i=0;i<k;i++) {
        	if(arr[i]!=null)
        	q.add(arr[i]);
        }
        while(!q.isEmpty()) {
        	Node curr = q.remove();
        	if(curr.next!=null) {
        		q.add(curr.next);
        	}
        	if(head==null) {
        		head=curr;
        		last=curr;	
        	} else {
        		last.next=curr;
        		last=curr;
        	}
        }
        return head;
	}
	public static void main(String[] args) {
		Node arr[] = new Node[3]; 
		  
        arr[0] = new Node(1); 
        arr[0].next = new Node(3); 
        arr[0].next.next = new Node(5); 
        arr[0].next.next.next = new Node(7); 
  
        arr[1] = new Node(2); 
        arr[1].next = new Node(6); 
        arr[1].next.next = new Node(10); 
        arr[1].next.next.next = new Node(18); 
  
        arr[2] = new Node(0); 
        arr[2].next = new Node(10); 
        arr[2].next.next = new Node(11); 
        arr[2].next.next.next = new Node(9); 
        
        mergeList(arr, 3);
	}

}
