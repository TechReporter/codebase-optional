/**
 * 
 */
package treedatastructure;

/**
 * @author 212720190
 * @date Jul 30, 2019
 */
public class InorderTraversalBST {

	Node root;

	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}

	}

	 void printInorder(Node root) {
		 if(root == null)
			 return;
		printInorder(root.left);
		System.out.println(root.data);
		printInorder(root.right);
	}
	 
	 void printPostOrder(Node root) {
		 if(root == null)
			 return;
		 printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.println(root.data);

	}

	 void printPreOrder(Node root) {
		 if(root == null)
			 return;
			System.out.println(root.data);
		 printPreOrder(root.left);
		printPreOrder(root.right);
	}

	public static void main(String[] args) {
		InorderTraversalBST tree = new InorderTraversalBST(); 
		tree.root = new Node(4); 
		tree.root.left = new Node(1); 
		tree.root.right = new Node(7); 
		tree.root.right.left = new Node(5); 
		tree.root.right.right = new Node(8); 

		tree.printInorder(tree.root);
		System.out.println("postorder");
		tree.printPostOrder(tree.root);
		System.out.println("preorder");
		tree.printPreOrder(tree.root);
	}

}
