package linkedlistpractice;

/**
 * @author 212720190
 * @date Jan 19, 2020
 */
public class CheckIfTwoHalfMatch {
	static Node head;
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static boolean isMatch(Node head) {
		if(head.next == null || head==null)
			return false;

		Node slow = head;
		Node fast = head.next;

		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		slow = slow.next;
		while(slow!=null ) {
			if(slow.data!=head.data) {
				return false;
			}
			slow = slow.next;
			head = head.next;
		}
		return true;
	}

	public static void main(String[] args) {
		head = new Node(5);
		head.next = new Node(10);
		head.next.next = new Node(20);
		head.next.next.next = new Node(55);
		head.next.next.next = new Node(5);
		head.next.next.next.next = new Node(10);
		head.next.next.next.next.next = new Node(20);

		System.out.println(isMatch(head));
	}

}
