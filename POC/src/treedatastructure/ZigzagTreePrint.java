package treedatastructure;

import java.util.Queue;
import java.util.Stack;

/**
 * @author 212720190
 * @date Jan 13, 2020
 */
public class ZigzagTreePrint {
	Node root;

	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}

	}

	static void zigZag(Node root) {
		if(root == null)
			return;
		Queue<Node> queue = new java.util.LinkedList<>();
		queue.add(root);
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		s1.add(root);

		while(!s1.isEmpty() || !s2.isEmpty()) {
			while(!s1.isEmpty()) {
				Node node = s1.pop();
				System.out.println(node.data+" ");
				if(node.left!=null)
					s2.add(node.left);
				if(node.right!=null)
					s2.add(node.right);
			}
			System.out.println();
			while(!s2.isEmpty()) {
				Node node = s2.pop();
				System.out.println(node.data+" ");
				if(node.right!=null)
					s1.add(node.right);
				if(node.left!=null)
					s1.add(node.left);
			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		ZigzagTreePrint tree = new ZigzagTreePrint(); 
		tree.root = new Node(4); 
		tree.root.left = new Node(1); 
		tree.root.right = new Node(7); 
		tree.root.right.left = new Node(5); 
		tree.root.right.right = new Node(8); 
		tree.root.right.right.left = new Node(10); 
		tree.root.right.right.right = new Node(11); 
		tree.root.left.left = new Node(14); 
		tree.root.left.right = new Node(18); 
		tree.root.left.right.left = new Node(15); 
		tree.root.left.right.right = new Node(19); 

		zigZag(tree.root);

	}

}
