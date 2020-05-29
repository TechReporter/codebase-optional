/**
 * 
 */
package treepractice;

/**
 * @author 212720190
 * @date Mar 29, 2020
 */
public class SortedArrayToBst {
	static Node root;
	static class Node {
		int val;
		Node left;
		Node right;
		public Node(int val) {
			this.val = val;
		}
	}
	static Node convertToBst(int[] arr, int low, int high) {
		if(arr.length==0 || arr==null)
			return null;
		if(low>high)
			return null;
		int mid=low+(high-low)/2;
		Node curr = new Node(arr[mid]);
		curr.left = convertToBst(arr, low, mid-1);
		curr.right = convertToBst(arr, mid+1, high);
		return curr;
	}
	public static void main(String[] args) {
		int[] arr = {-10,2,5,7,12};
		
		root = convertToBst(arr,0,arr.length-1);
		System.out.println();
	}

}
