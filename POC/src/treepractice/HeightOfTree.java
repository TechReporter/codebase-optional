/**
 * 
 */
package treepractice;

/**
 * @author 212720190
 * @date Feb 12, 2020
 */
public class HeightOfTree {

	static Node root;

	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}
	}

	static int getHeight(Node root) {
		if(root==null)
			return 0;
		int lHight = getHeight(root.left);
		int rHeight = getHeight(root.right);

		if(lHight>rHeight)
			return lHight+1;
		else
			return rHeight+1;
	}
	public static void main(String[] args) {
		root = new Node(10);
		root.left = new Node(12);
		root.right = new Node(15);
		root.left = new Node(20);
		root.left.left = new Node(23);
		root.left.right = new Node(18);
		root.left.right.right = new Node(28);

		System.out.println(getHeight(root));
	}

}
