/**
 * 
 */
package treedatastructure;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author 212720190
 * @date Mar 30, 2020
 */
public class KthSmallestInBst {
	static Node root;
	static class Node {
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
		}
	}

	static int kthSmallest(Node root, int k) {
		if(root==null)
			return 0;
		PriorityQueue<Integer> q = new PriorityQueue<>();
		Queue<Node> q1 = new java.util.LinkedList<>();

		q1.add(root);
		q.add(root.data);
		while(!q1.isEmpty()) {
			Node curr = q1.remove();
			if(curr.left!=null) {
				q1.add(curr.left);
				q.add(curr.left.data);
			}
			if(curr.right!=null) {
				q1.add(curr.right);
				q.add(curr.right.data);
			}
		}
		return kthsmallest(k, q);
	}

	static int kthsmallest(int k,PriorityQueue<Integer> q) {
		while(k>1) {
			q.remove();
			k--;
		}
		return q.remove();
	}
	public static void main(String[] args) {
		root = new Node(10); 
		root.left = new Node(13); 
		root.right = new Node(6); 
		root.left.left = new Node(12); 
		root.left.right = new Node(9); 
		System.out.println(kthSmallest(root, 3));

	}

}
