/**
 * 
 */
package treepractice;

/**
 * @author 212720190
 * @date Jan 24, 2020
 */
public class PrintAllAncestors {

	Node root;

	static class Node {
		int data;
		Node left,right;

		public Node(int data) {
			this.data = data;
			this.left=right=null;
		}
	}
	static boolean ancestors(Node node, int val) {
		if(node==null)
			return false;
		if(node.data==val) {
			return true;
		}
		if(ancestors(node.left,val) || ancestors(node.right,val)) {
			System.out.println(node.data+" ");
			return true;
		}
			return false;
	}

	public static void main(String[] args) {
		PrintAllAncestors tree = new PrintAllAncestors(); 
		tree.root = new Node(5); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(10); 
		tree.root.left.left = new Node(8); 
		tree.root.left.left.right = new Node(6); 
		tree.root.right.left = new Node(3); 
		ancestors(tree.root,6);
	}

}
