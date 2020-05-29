package treepractice;

/**
 * @author 212720190
 * @date Jan 24, 2020
 */
//check if parent node has sum of child immediate node 
public class ParentHasChildSum {
	
	static Node root;

	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}

	}
	
	 static boolean hasChildSum(Node node) {
		 if(node == null || (node.left==null && node.right==null)) {
			 return true;
		 }
		 int leftVal = node.left!=null?node.left.data:0;
		 int rightVal = node.right!=null?node.right.data:0;

		 return (rightVal+leftVal==node.data) &&
				 hasChildSum(node.left) && hasChildSum(node.right);
	 }

	public static void main(String[] args) {
		ParentHasChildSum.root = new Node(10); 
		ParentHasChildSum.root.left = new Node(7); 
		ParentHasChildSum.root.right = new Node(3); 
		ParentHasChildSum.root.left.right = new Node(5); 
		ParentHasChildSum.root.left.left = new Node(2); 
		ParentHasChildSum.root.right.left = new Node(2); 
		ParentHasChildSum.root.right.right = new Node(1); 
		
		System.out.println(hasChildSum(root));
	}

}
