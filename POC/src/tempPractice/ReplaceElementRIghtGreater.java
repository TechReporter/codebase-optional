/**
 * 
 */
package tempPractice;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 212720190
 * @date Apr 9, 2020
 */
public class ReplaceElementRIghtGreater {
	static Node root;
	static class Node {
		int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
		}
	}

	//using BST
	//each element is replace by inorder successor of BST
	public static void main(String[] args) {
		int[] arr = {10,100,93,32,35,65,80,90,94,6}; 
		for(int i=arr.length-1;i>=0;i--) {
			AtomicInteger succ = new AtomicInteger(-1);
			root = insert(arr[i], root, succ);
			arr[i]=succ.get();
		}
		System.out.println(Arrays.toString(arr));
	}

	static Node insert(int i, Node root, AtomicInteger succ) {
		if(root==null)
			return new Node(i);
		if(i<root.data) {
			succ.set(root.data);
			root.left=insert(i, root.left, succ);
		} else if(i>root.data) {
			root.right=insert(i, root.right, succ);
		}
		return root;
	}
}
