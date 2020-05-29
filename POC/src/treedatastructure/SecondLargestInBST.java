package treedatastructure;

/**
 * @author 212720190
 * @date Dec 11, 2019
 */
public class SecondLargestInBST {
	Node root;
	static int count=0;
	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}
	}

	void checkCount(Node root) {
		if(root==null)
			return;
		checkCount(root.right);
		count++;
		if(count==2)
			System.out.println(root.data);
		checkCount(root.left);

	}

	public static void main(String[] args) {
		SecondLargestInBST tree = new SecondLargestInBST(); 
		tree.root = new Node(10); 
		tree.root.left = new Node(6); 
		tree.root.right = new Node(23); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(8); 
		tree.checkCount(tree.root);
	}

}
