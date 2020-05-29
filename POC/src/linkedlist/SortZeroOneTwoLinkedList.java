/**
 * 
 */
package linkedlist;

/**
 * @author 212720190
 * @date Apr 13, 2020
 */
public class SortZeroOneTwoLinkedList {
	Node head;
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}
	
	static void sortZeroOneTwo(Node head) {
		int zero=0,one=0,two=0;
		Node curr=head;
		while(curr.next!=null) {
			if(curr.data==0)
				zero++;
			else if(curr.data==1)
				one++;
			else
				two++;
		}
		curr=head;
		//rest
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
