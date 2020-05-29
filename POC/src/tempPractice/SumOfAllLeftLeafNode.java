/**
 * 
 */
package tempPractice;

/**
 * @author 212720190
 * @date Apr 9, 2020
 */
public class SumOfAllLeftLeafNode {

	Node root;

	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}
	}
	
	static int sumLeftLeafNode(Node root, boolean flag) {
		if(root==null)
			return 0;
		int result=0;
		if(root.left==null && root.right==null && flag==true)
			result=root.data;
		result+=sumLeftLeafNode(root.left, true);
		result+=sumLeftLeafNode(root.right, false);
		return result;
	}
	
	
	
	public static void main(String[] args) {
		SumOfAllLeftLeafNode tree = new SumOfAllLeftLeafNode(); 
		tree.root = new Node(20); 
		tree.root.left = new Node(9); 
		tree.root.right = new Node(49); 
		tree.root.left.right = new Node(12); 
		tree.root.left.left = new Node(5); 
		tree.root.right.left = new Node(23); 
		tree.root.right.right = new Node(52); 
		tree.root.left.right.right = new Node(12); 
		tree.root.right.right.left = new Node(50); 

		System.out.println(sumLeftLeafNode(tree.root,false));
	}

}
