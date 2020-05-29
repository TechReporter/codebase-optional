package treedatastructure;

import java.util.Queue;

/**
 * @author 212720190
 * @date Nov 29, 2019
 */

//level order in new line on each level
public class LevelOrderTreeTraversal {

	Node root;

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}
	int maxWidth =1;
	void levelOrder(Node root) {
		Queue<Node> queue = new java.util.LinkedList<>();
		queue.add(root);

		while(!queue.isEmpty()) {
			int n=queue.size();
			maxWidth = Math.max(n,maxWidth);
			while(n>0) {
				Node p = queue.poll();
				System.out.print(p.data+" ");
				if(p.left !=null)
					queue.add(p.left);
				if(p.right !=null)
					queue.add(p.right);	
				n--;
			}
			System.out.println();
		}
		System.out.println("maxwidth _"+maxWidth);
	}
	public static void main(String[] args) {
		LevelOrderTreeTraversal tree = new LevelOrderTreeTraversal(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.left.left = new Node(4); 
		tree.root.left.left.left.left = new Node(5); 
		tree.root.left.left.left.right = new Node(74); 
		tree.root.left.right = new Node(15);
		tree.root.left.right.right = new Node(31); 
		tree.root.left.right.left = new Node(34); 
		tree.root.right.left = new Node(10); 
		tree.root.right.left.right = new Node(23); 
		tree.root.right.right = new Node(20); 

		tree.levelOrder(tree.root);

	}

}
