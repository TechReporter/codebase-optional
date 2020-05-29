package treepractice;

/**
 * @author 212720190
 * @date Jan 25, 2020
 */
public class SiblingOfNode {
	static Node root;

	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}
	}
	
	static Node getSibling(Node node, int val) {
		if(node ==null || node.data==val) {
			return null;
		}
		if(node.left!=null || node.left.data==val) {
			return node.right;
		}
		if(node.right!=null || node.right.data==val) {
			return node.left;
		}
		
		Node n = getSibling(node.left, val);
		if(n!=null)
			return n;
		 n = getSibling(node.right, val);
			return n;
		
	}
	public static void main(String[] args) {
		SiblingOfNode.root = new Node(10); 
		SiblingOfNode.root.left = new Node(7); 
		SiblingOfNode.root.right = new Node(3); 
		SiblingOfNode.root.left.right = new Node(5); 
		SiblingOfNode.root.left.left = new Node(4); 
		SiblingOfNode.root.right.left = new Node(2); 
		SiblingOfNode.root.right.right = new Node(1);
		Node nn = getSibling(root, 2);
		System.out.println(nn.data);
		
	}

}
