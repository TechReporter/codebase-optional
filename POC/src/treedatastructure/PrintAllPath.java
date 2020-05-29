/**
 * 
 */
package treedatastructure;

/**
 * @author 212720190
 * @date Apr 13, 2020
 */
public class PrintAllPath {
	Node root;
	static class Node {
		int data;
		Node left,right;

		public Node(int data) {
			this.data = data;
			this.left=right=null;
		}
	}
	static void printPath(Node root, int[] arr,int len) {
		if(root==null)
			return;
		if(root.left==null && root.right==null)
			//print
			arr[len]=root.data;
		len++;
		printPath(root.left, arr, len);
		printPath(root.right, arr, len);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
