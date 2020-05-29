/**
 * 
 */
package treedatastructure;

/**
 * @author 212720190
 * @date Jul 4, 2019
 */
public class CheckTreeSibling {
	Node root;

	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}

	}

	void checkSibling(Node root) {

		Node current = root;
		if(current == null)
			return;

		if(current.left !=null && current.right!=null) {
			int left = current.left.data;
			int right = current.right.data;
			if((left == 4 && right == 5) || (left == 5 && right == 4))
				System.out.println("sibling");
		}

		checkSibling(current.left);
		checkSibling(current.right);
	}

	public static void main(String[] args) {
		CheckTreeSibling tree = new CheckTreeSibling(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.checkSibling(tree.root);
	}

}
