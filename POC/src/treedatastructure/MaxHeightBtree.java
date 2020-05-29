/**
 * 
 */
package treedatastructure;

/**
 * @author 212720190
 * @date May 26, 2019
 */
public class MaxHeightBtree {

	Node root;
	
static class Node {
	int data;
	Node left,right;
	
	public Node(int data) {
		this.data = data;
		this.left=null;
		this.right=null;
	}
}
	
	int findMaxHeight(Node val) {
		if(val==null)
			return 0;
		return Math.max(findMaxHeight(val.left), findMaxHeight(val.right))+1;
	}
	
	public static void main(String[] args) {

		MaxHeightBtree node = new MaxHeightBtree();
		node.root = new Node(2);
		node.root.left = new Node(5);
		node.root.right = new Node(7);		
		node.root.right.left = new Node(4);		
		node.root.left.left = new Node(10);	
		node.root.right.left.left = new Node(66);		

		System.out.println(node.findMaxHeight(node.root));

	}

}
