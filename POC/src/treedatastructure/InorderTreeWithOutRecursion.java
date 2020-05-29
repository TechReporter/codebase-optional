/**
 * 
 */
package treedatastructure;

import java.util.Stack;

/**
 * @author 212720190
 * @date Jul 4, 2019
 */
public class InorderTreeWithOutRecursion {
	Node root;

	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}

	}

	void inorder() {
		Stack<Node> stk = new Stack<>();
		Node current = root;
		while(current !=null || stk.size()>0) {
			while(current !=null) {
				stk.push(current);
				current = current.left;
			}
			current = stk.pop();
			System.out.print(current.data);
			current = current.right;
		}
	}
	
	//preorder
	
	void preOrder() {
		Stack<Node> stk = new Stack<>();
		Node current = root;
		while(current !=null || stk.size()>0) {
			while(current !=null) {
				System.out.print(current.data);
				stk.push(current);
				current = current.left;
			}
			current = stk.pop();
			current = current.right;
		}
	}
	
	
	public static void main(String[] args) {
		InorderTreeWithOutRecursion tree = new InorderTreeWithOutRecursion(); 
		tree.root = new Node(4); 
		tree.root.left = new Node(1); 
		tree.root.right = new Node(7); 
		tree.root.right.left = new Node(5); 
		tree.root.right.right = new Node(8); 
		tree.inorder();
		System.out.println();
		tree.preOrder();
	}

}
