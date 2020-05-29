/**
 * 
 */
package treepractice;

/**
 * @author 212720190
 * @date Jan 25, 2020
 */
public class CheckTwoSiblings {


	static Node root;

	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}
	}
	
	static boolean isSiblings(Node n1, int val1, int val2) {
		if(n1==null)
			return false;
		
		if(n1.left!=null && n1.right!=null) {
			if((n1.left.data==val1 && n1.right.data==val2) ||
					(n1.right.data==val1 && n1.left.data==val2)
					|| isSiblings(n1.left, val1, val2)
					|| isSiblings(n1.right, val1, val2)) {
				return true;
			}
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		CheckTwoSiblings.root = new Node(10); 
		CheckTwoSiblings.root.left = new Node(7); 
		CheckTwoSiblings.root.right = new Node(3); 
		CheckTwoSiblings.root.left.right = new Node(5); 
		CheckTwoSiblings.root.left.left = new Node(4); 
		CheckTwoSiblings.root.right.left = new Node(2); 
		
		System.out.print(isSiblings(root,5,4));
	}

}
