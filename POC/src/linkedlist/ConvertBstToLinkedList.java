/**
 * 
 */
package linkedlist;

/**
 * @author 212720190
 * @date Apr 8, 2020
 */
public class ConvertBstToLinkedList {

	//convert bst to doubly linked list, in inorder traversal. so it will be sprted.
	static Node head;
	static Node prev;
	static class Node {
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
		}
	}
	
	static void convertBstToDll(Node root) {
		if(root==null)
			return;
		convertBstToDll(root.left);
		if(prev==null) {
			head = root;
			prev=root;
		} else {
			root.left=prev;
			prev.right=root;
			prev=root;
		}
		convertBstToDll(root.right);
	}
	public static void main(String[] args) {
		head = new Node(4); 
		head.left = new Node(1); 
		head.right = new Node(7); 
		head.right.left = new Node(5); 
		head.right.right = new Node(8); 
		
		convertBstToDll(head);
	}

}
