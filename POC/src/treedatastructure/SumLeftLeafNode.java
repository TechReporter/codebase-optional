/**
 * 
 */
package treedatastructure;

/**
 * @author 212720190
 * @date Mar 27, 2020
 */
public class SumLeftLeafNode {
	Node root;
	static class Node {
		int data;
		Node left,right;
		public Node(int data) {
			this.data = data;
		}
	}
	static int sum=0;
	static int sumLeaf(Node root, boolean isleft) {
		if(root==null)
			return 0;

		if(root.left==null && root.right==null && isleft) {
			sum+=root.data;
		}
		sumLeaf(root.left, true);
		sumLeaf(root.right, false);
		return sum;
	}

	public static void main(String[] args) {
		SumLeftLeafNode tree = new SumLeftLeafNode(); 
		tree.root = new Node(1); 
		System.out.println(sumLeaf(tree.root, false));
	}

}
