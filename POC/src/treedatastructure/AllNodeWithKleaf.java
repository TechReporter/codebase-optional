/**
 * 
 */
package treedatastructure;

/**
 * @author 212720190
 * @date Aug 10, 2019
 */
public class AllNodeWithKleaf {

	Node root;

	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}

	}
	
	static int AllNodeKleaf(Node node, int k) {
		
		if(node==null)
			return 0;
		
		int total=0;
		
		if(node.left==null && node.right==null)
			return 1;
		
		total=AllNodeKleaf(node.left, k)+AllNodeKleaf(node.right, k);
		if(total==k)
			System.out.println("node with k leaf node "+node.data);
		return total;
	}
	
	public static void main(String[] args) {
		AllNodeWithKleaf tree = new AllNodeWithKleaf(); 
		tree.root = new Node(20); 
		tree.root.left = new Node(9); 
		tree.root.right = new Node(49); 
		tree.root.left.right = new Node(11); 
		tree.root.left.left = new Node(5); 
		tree.root.right.left = new Node(23); 
		tree.root.right.right = new Node(52); 
		tree.root.left.right.right = new Node(12); 
		tree.root.right.right.left = new Node(50); 
		
		System.out.println("total leaf node "+AllNodeKleaf(tree.root,1));
	}

}
