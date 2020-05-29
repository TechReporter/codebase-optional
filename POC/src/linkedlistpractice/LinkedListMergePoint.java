/**
 * 
 */
package linkedlistpractice;

/**
 * @author 212720190
 * @date Mar 11, 2020
 */
public class LinkedListMergePoint {

	static Node head;
	static Node head1;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}	
	
	static int findMergeNode(Node head1, Node head2) {
        if( head1==null || head2==null)
        return 0;
        while(head1!=null || head2!=null) {
            if(head1.data==head2.data)
            return head1.data;
            head1=head1.next;
            head2=head2.next;
        }
        return 0; 
	}
	public static void main(String[] args) {
		head = new Node(5);
		head.next = new Node(10);
		head.next.next = new Node(20);
		head.next.next.next = new Node(30);
		head.next.next.next.next = new Node(40);
		
		head1 = new Node(6);
		head1.next = new Node(12);
		head1.next.next = new Node(20);
		head1.next.next.next = new Node(30);
		head1.next.next.next.next = new Node(40);
		
		System.out.println(findMergeNode(head, head1));
	}
	
	

}
