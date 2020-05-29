/**
 * 
 */
package treedatastructure;

/**
 * @author 212720190
 * @date Apr 14, 2019
 */
public class BinaryTreeImpl {
private TreeNode root;

	public void insert(int data) {
		if(root!= null)
			this.root.insert(data);
		else
			this.root = new TreeNode(data);	
	}
	
	public TreeNode find(int data) {
		if(root != null)
			return root.find(data);
		return null;
	}
	
	public void deleteNode(int data) {
		TreeNode current = this.root;
		TreeNode parent = this.root;
		boolean isLeftChild = false;
		
		if(current == null)
			return;
		
		if(current !=null && current.getData() != data) {
			parent = current;
			if(current.getData()>data) {
				current = current.getLeft();
			isLeftChild = true;	
			} else {
				current = current.getRight();
				isLeftChild = false;	
			}
		}
		if(current == null)
			return;
		if(current.getLeft() == null && current.getRight() == null) {
			if(current == root) {
				root = null;
			} else {
				if(isLeftChild)
					parent.setLeft(null);
				else
					parent.setRight(null);
			}
		}
			
	}
	
	public Integer smallest() {
		if(root != null)
			return root.smallestNodeData();
		return null;
	}
	
	public Integer largest() {
		if(root != null)
			return root.largestNodeData();
		return null;
	}
	
}
