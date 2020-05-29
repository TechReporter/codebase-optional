package treedatastructure;

/**
 * @author 212720190
 * @date Aug 10, 2019
 */
public class MaxPathSumBinaryTree {

	Node root;
	static int maxSum=Integer.MIN_VALUE;

	static class Node {
		int data;
		Node left,right;

		public Node(int data) {
			this.data = data;
			this.left=right=null;
		}
	}
	
	//another way
	static void maxSum(Node root, int sum) {
		if(root==null) {
			return;
		}
		
		if(root.left==null && root.right==null && root.data+sum>maxSum) {
			maxSum = root.data+sum;
		}
			
		 maxSum(root.left, sum+root.data);
		 maxSum(root.right, sum+root.data);
		 
	}

	public static void main(String[] args) {

		MaxPathSumBinaryTree tree = new MaxPathSumBinaryTree(); 
		tree.root = new Node(-15); 
		tree.root.left = new Node(5); 
		tree.root.right = new Node(6); 
		tree.root.left.left = new Node(-8); 
		tree.root.left.right = new Node(1); 
		tree.root.left.left.left = new Node(2); 
		tree.root.left.left.right = new Node(6); 
		tree.root.right.left = new Node(3); 
		tree.root.right.right = new Node(9); 
		tree.root.right.right.right = new Node(0); 
		tree.root.right.right.right.left = new Node(4); 
		tree.root.right.right.right.right = new Node(-1); 
		tree.root.right.right.right.right.left = new Node(10); 

		maxSum(tree.root,0);
		System.out.println(maxSum);

	}

}
