/**
 * 
 */
package treedatastructure;

/**
 * @author 212720190
 * @date Apr 14, 2019
 */
public class TreeNode {

	private int data;
	private TreeNode left, right;
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	public TreeNode find(int data) {
		if(this.data == data)
			return this;
		if(this.data<data && right != null)
			return this.right;
		if(this.data>data && left != null)
			return this.left;
		return null;
	}
	
	public void insert(int data) {
		if(data> this.data) {
			if(this.right == null)
				this.right = new TreeNode(data);
			else
				this.right.insert(data);
		} else {
			if(this.left == null)
				this.left = new TreeNode(data);
			else
				this.left.insert(data);
		}
	}
	
	public int smallestNodeData() {
		if(this.left == null)
			return this.data;
		return this.left.smallestNodeData();
	}
	
	public int largestNodeData() {
		if(this.right == null)
			return this.data;
		return this.right.largestNodeData();
	}
	
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
}
