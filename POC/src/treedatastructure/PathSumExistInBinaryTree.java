package treedatastructure;

/**
 * @author 212720190
 * @date Dec 12, 2019
 */
public class PathSumExistInBinaryTree {

	Node root;

	static class Node {
		int data;
		Node left,right;

		public Node(int data) {
			this.data = data;
			this.left=right=null;
		}
	}

	static boolean sumExist(Node node,int sum) {
		boolean flag=false;

		if(node==null) {
			return false;
		} else if(node.left==null && node.right==null && sum-node.data==0)
			return true;
		if(node.left!=null)
		flag=sumExist(node.left, sum-node.data);
		if(node.right!=null)
		flag=sumExist(node.right, sum-node.data);
		return flag;
	}

	public static void main(String[] args) {
		PathSumExistInBinaryTree tree = new PathSumExistInBinaryTree(); 
		tree.root = new Node(5); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(6); 
		tree.root.left.left = new Node(8); 
		tree.root.left.left.right = new Node(6); 
		tree.root.right.left = new Node(3); 

		System.out.println(sumExist(tree.root, 14));
	}

}
