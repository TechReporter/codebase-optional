package treedatastructure;

/**
 * @author 212720190
 * @date Jun 16, 2019
 */
public class TreeTraversal {
	Node root;
	static class Node {
		int data;
		Node left,right;

		public Node(int data) {
			this.data = data;
			this.left=right=null;
		}
	}

	void postOrder(Node node) {
		if(node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data+" ");
	}

	void preOrder(Node node) {
		if(node == null)
			return;
		System.out.println(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
	}

	void inOrder(Node node) {
		if(node == null)
			return;
		inOrder(node.left);
		System.out.println(node.data+" ");
		inOrder(node.right);
	}

	public static void main(String[] args) {
		TreeTraversal tree = new TreeTraversal(); 
		tree.root = new Node(1);
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 

		System.out.println("pre order");
		tree.preOrder(tree.root);
		System.out.println("in order");
		tree.inOrder(tree.root);
		System.out.println("post order");
		tree.postOrder(tree.root);

	}


}
