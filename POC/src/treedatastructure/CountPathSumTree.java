/**
 * 
 */
package treedatastructure;

/**
 * @author 212720190
 * @date Mar 26, 2020
 */
public class CountPathSumTree {
	static Node root;
	static int count;
	static class Node {
		int data;
		Node left,right;

		public Node(int data) {
			this.data = data;
			this.left=right=null;
		}
	}
	
	static int pathSum(Node root, int sum) {
		if(root == null) {
            return count;
        }
        helper(root, sum);
        if(root.left != null) {
            pathSum(root.left, sum);
        }
        if(root.right != null) {
            pathSum(root.right, sum);
        }
        return count;
	}

	static void helper(Node root, int sum) {
		if(root==null)
			return;
		if(root.data==sum)
			count++;
		if(root.left!=null)
			helper(root.left, sum-root.data);
		if(root.right!=null)
			helper(root.right, sum-root.data);
	}

	public static void main(String[] args) {
		root = new Node(10); 
		root.left = new Node(5); 
		root.right = new Node(-3); 
		root.right.right = new Node(11); 
		root.left.left = new Node(3);
		root.left.right = new Node(2);
		root.left.right.right = new Node(1); 
		root.left.left.left = new Node(3); 
		root.left.left.right = new Node(-2); 
		root.right.left = new Node(3); 
		System.out.println(pathSum(root, 8));
	}

}
