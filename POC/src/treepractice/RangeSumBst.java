/**
 * 
 */
package treepractice;

/**
 * @author 212720190
 * @date Apr 1, 2020
 */
public class RangeSumBst {
	static Node root;
	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}
	}
	
	static int rangeSum(Node root, int left,int right) {
		if(root==null)
			return 0;
		int sum=0;
		if(root.data>=left && root.data<=right) {
			sum+=root.data;
		}
		
		sum+=rangeSum(root.left, left, right);
		sum+=rangeSum(root.right, left, right);
		return sum;
	}
	
	public static void main(String[] args) {
		RangeSumBst.root = new Node(10); 
		RangeSumBst.root.left = new Node(5); 
		RangeSumBst.root.right = new Node(15); 
		RangeSumBst.root.left.right = new Node(7); 
		RangeSumBst.root.left.left = new Node(3); 
		RangeSumBst.root.right.right = new Node(18); 
		System.out.println(rangeSum(RangeSumBst.root, 7, 15));
	}

}
