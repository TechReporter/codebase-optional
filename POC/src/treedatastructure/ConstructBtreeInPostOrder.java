package treedatastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Feb 7, 2020
 */
//last lement of postorder is root of tree, search that element in inorder.
//all element before that is left , all element after that is right. 
public class ConstructBtreeInPostOrder {

	Node root;

	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
			this.left=null;
			this.right=null;
		}

	}

	public static void main(String[] args) {

		int[] inorder = {3,2,5,1,7,6};
		int[] postorder = {1,3,6,2,7,5};
		
		constructTree(inorder, postorder);

	}

	static Node constructTree(int[] inorder, int[] postorder) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<inorder.length;i++) {
			map.put(inorder[i],i);
		}
		return null;

	}
	
	Node BstUtil(int[] inorder, int[] postOrder, Map<Integer, Integer> map, int start, int end) {
		
		if(start>end) {
			return null;
		}
		int len = postOrder.length;
		Node root = new Node(postOrder[len]);
		int index = map.get(root.data);
		root.left = BstUtil(inorder, postOrder, map,start,index-1);
		root.right = BstUtil(inorder, postOrder, map, index+1, end);
		return root;
	}

}
