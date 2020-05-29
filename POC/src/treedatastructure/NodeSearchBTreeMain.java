/**
 * 
 */
package treedatastructure;

/**
 * @author 212720190
 * @date Apr 4, 2019
 */
public class NodeSearchBTreeMain {

	
	NodeSearchBTree root;
	
	public boolean ifNodeExist(NodeSearchBTree node, int val) {
		boolean isExist = false;
		if(node == null)  {
			isExist = false;
		}
		
		else if(node.data == val) {
			isExist = true;
		}
		else {
			isExist = ifNodeExist(node.left, val);
			isExist = ifNodeExist(node.right, val);	
		}
	
		return isExist;
	}
	
	public static void main(String[] args) {

		NodeSearchBTreeMain tree = new NodeSearchBTreeMain(); 
        tree.root = new NodeSearchBTree(1); 
        tree.root.left = new NodeSearchBTree(2); 
        tree.root.right = new NodeSearchBTree(3); 
        tree.root.left.left = new NodeSearchBTree(5); 
        tree.root.left.right = new NodeSearchBTree(4); 
  
        System.out.println(tree.ifNodeExist(tree.root, 4));
	}

}
