/**
 * 
 */
package treedatastructure;

import java.util.Stack;

/**
 * @author 212720190
 * @date Sep 7, 2019
 */
public class ConstructBSTFromPreorder {

	Node root;
	static class Node {
		Node left,right;
		int data;

		Node(int data) {
			this.data=data;
		}
	}

	static Node convertBST(int[] arr) {
		Stack<Node> stk = new Stack<>();
		Node node = new Node(arr[0]);
		stk.push(node);

		for(int i=1;i<arr.length;++i) {
			Node tmp = null;
			if(!stk.isEmpty() && arr[i]>stk.peek().data) {
				tmp = stk.pop();
				if(tmp !=null) {
					tmp.right = new Node(arr[i]);
					stk.push(tmp.right);
				}
			}
			else {
				tmp = stk.pop();
				tmp.left = new Node(arr[i]);
				stk.push(tmp.left);
			}
		}
		return node;
	}
	static void printOrder(Node n) {
		if(n ==null) {
			return;
		}
		printOrder(n.left);
		System.out.println(n.data+" ");
		printOrder(n.right);
	}

	public static void main(String[] args) {
		int[] arr = {4,10,13,6,9};
		Node root = convertBST(arr);
		printOrder(root);
	}
}
