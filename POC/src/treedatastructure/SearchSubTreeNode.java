/**
 * 
 */
package treedatastructure;

/**
 * @author 212720190
 * @date Jan 5, 2020
 */
//return subtree if node value matched

public class SearchSubTreeNode {
	TreeNode root;

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x; 
		}
	}

	//iterative approach
	public TreeNode searchBST(TreeNode root, int val) {
		if(root==null) {
			return null;
		}
		while(root!=null && root.val!=val) {
			if(val<root.val) {
				root=root.left;
			} else {
				root=root.right;
			}
		}
		return root;
	}
	//recursive approach
	public TreeNode searchBSTRecur(TreeNode root, int val) {
		if(root==null) {
			return null;
		}
		if(root.val==val) {
			return root; 
		} else if(val<root.val) {
			return searchBST(root.left, val);
		} else {
			return searchBST(root.right, val);
		}
	}


	public static void main(String[] args) {
		SearchSubTreeNode tree = new SearchSubTreeNode();
		tree.root = new TreeNode(4); 
		tree.root.left = new TreeNode(1); 
		tree.root.right = new TreeNode(7); 
		tree.root.right.left = new TreeNode(5); 
		tree.root.right.right = new TreeNode(8); 

		System.out.println(tree.searchBST(tree.root, 7));
		System.out.println(tree.searchBSTRecur(tree.root, 7));

	}

}
