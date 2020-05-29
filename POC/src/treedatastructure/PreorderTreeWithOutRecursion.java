/**
 * 
 */
package treedatastructure;

import java.util.Stack;

/**
 * @author 212720190
 * @date Jul 4, 2019
 */
public class PreorderTreeWithOutRecursion {

	Node root;

	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}

	}
	
	void preOrder() {
		
		Stack<Node> stk = new Stack<>();
		stk.push(root);
		while(stk.size()>0) {
			Node current = stk.pop();
			System.out.println(current.data);
			
			if(current.right !=null) {
				stk.push(current.right);
			}
			if(current.left !=null) {
				stk.push(current.left);
			}
		}
		
	}
	public static void main(String[] args) {
		PreorderTreeWithOutRecursion tree = new PreorderTreeWithOutRecursion(); 
		tree.root = new Node(10); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(2); 
        tree.root.left.left = new Node(3); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(2); 
		tree.preOrder();
	}

}
