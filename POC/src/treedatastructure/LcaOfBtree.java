/**
 * 
 */
package treedatastructure;

/**
 * @author 212720190
 * @date Feb 6, 2020
 */
public class LcaOfBtree {

	Node root;

	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}

	}
	static Node getLca(Node root, int n1, int n2) {
		if(root==null)
			return null;
		if(root.data==n1 || root.data==n2)
			return root;
		
		Node left = getLca(root.left, n1,n2);
		Node right = getLca(root.right,n1,n2);
		
		if(left !=null && right !=null) {
			return root;
		}
		if(left==null && right==null)
			return null;
		
		return left!=null?left:right;
	}
	
	public static void main(String[] args) {
		LcaOfBtree tree = new LcaOfBtree(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		System.out.println(getLca(tree.root, 4, 5).data);
	
	}

}
