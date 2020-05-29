/**
 * 
 */
package hackerrank;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 212720190
 * @date Mar 8, 2020
 */
public class DetectCycle {

	static LinkedNode head;

	static class LinkedNode {
		int data;
		LinkedNode next;

		public LinkedNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static boolean hasCycle(LinkedNode head) {
	    if(head==null)
	        return false;
	   LinkedNode curr = head;
	   Set<Integer> set = new HashSet<>();
	   while(curr!=null) {
		   if(!set.contains(curr.data)) {
			   set.add(curr.data);
		   } else {
			   return true;
		   }
		   curr=curr.next;
	   }
	   return false;
	}
	
	public static void main(String[] args) {
		head = new LinkedNode(5);
		head.next = new LinkedNode(10);
		head.next.next = new LinkedNode(20);
		head.next.next.next = new LinkedNode(30);
		System.out.println(hasCycle(head));
		
	}

}
