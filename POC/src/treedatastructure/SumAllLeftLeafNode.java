package treedatastructure;


public class SumAllLeftLeafNode {

	Node root;

	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}

	}

	static boolean isNodeLeaf(Node node) {
		if(node == null)
			return false;
		else if(node.left== null && node.right==null)
			return true;
		return false;
	}

	static int sumLeftLeafNode(Node node) {

		int result=0;
		if(node !=null) {

			if(isNodeLeaf(node.left)) {
				result+=node.left.data;
			} else {
				result+=sumLeftLeafNode(node.left);
			}
			result+=sumLeftLeafNode(node.right);
		}
		return result;
	}

	public static void main(String[] args) {
		SumAllLeftLeafNode tree = new SumAllLeftLeafNode(); 
		tree.root = new Node(20); 
		tree.root.left = new Node(9); 
		tree.root.right = new Node(49); 
		tree.root.left.right = new Node(12); 
		tree.root.left.left = new Node(5); 
		tree.root.right.left = new Node(23); 
		tree.root.right.right = new Node(52); 
		tree.root.left.right.right = new Node(12); 
		tree.root.right.right.left = new Node(50); 

		System.out.println(sumLeftLeafNode(tree.root));
	}

}
