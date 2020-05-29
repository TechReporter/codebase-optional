package treepractice;

/**
 * @author 212720190
 * @date Jan 22, 2020
 */
public class CountLeafNode {

	static Node root;

	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}

	}
	static int countLeaf(Node node) {
		if(node==null) {
			return 0;
		}
		int countLeaf=0;
		if(node.left==null & node.right==null) {
			countLeaf++;
		}
		countLeaf+=countLeaf(node.left);
		countLeaf+=countLeaf(node.right);
		return countLeaf;
	}
	
	static int sumAllLeaf(Node node) {
		if(node==null) {
			return 0;
		}
		int sum = 0;
		if(node.left==null & node.right==null) {
			sum+=node.data;
		}
		sum+=sumAllLeaf(node.left);
		sum+=sumAllLeaf(node.right);
		return sum;
	}

	public static void main(String[] args) {
		CountLeafNode.root = new Node(5); 
		CountLeafNode.root.left = new Node(3); 
		CountLeafNode.root.right = new Node(10); 
		CountLeafNode.root.left.right = new Node(8); 
		CountLeafNode.root.left.left = new Node(1); 
		CountLeafNode.root.right.left = new Node(9); 
		CountLeafNode.root.right.right = new Node(7); 

		System.out.println(countLeaf(CountLeafNode.root));
		System.out.println(sumAllLeaf(CountLeafNode.root));
	}

}
