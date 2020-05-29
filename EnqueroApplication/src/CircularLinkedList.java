
public class CircularLinkedList {
	Node head;
	static class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}

		
	static boolean isCircular(Node root) {
		while(root==null)
			return false;
		Node p1=root;
		Node p2 = root.next;
		while(root.next!=null) {
			if(p1==p2)
				return true;
			p1=p1.next;
			p2=p2.next.next;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		

	}

}
