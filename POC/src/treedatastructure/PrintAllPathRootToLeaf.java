/**
 * 
 */
package treedatastructure;

/**
 * @author 212720190
 * @date Jan 16, 2020
 */
public class PrintAllPathRootToLeaf {

	Node root;
	static class Node {
		int data;
		Node left,right;

		public Node(int data) {
			this.data = data;
			this.left=right=null;
		}
	}
	
	static void printPath(Node root, String str) {
		if(root==null)
			return;
		
		str += root.data+"-";
		if(root.left==null && root.right==null)
		{
			str+=null;
			System.out.println(str);
			str = "";
		}
		printPath(root.left,str);
		printPath(root.right,str);
	}
	
	public static void main(String[] args) {
		PrintAllPathRootToLeaf tree = new PrintAllPathRootToLeaf(); 
		tree.root = new Node(15); 
		tree.root.left = new Node(5); 
		tree.root.right = new Node(6); 
		tree.root.left.left = new Node(8); 
		tree.root.left.right = new Node(1);
		String str = "";
		printPath(tree.root,str);
	}

}
