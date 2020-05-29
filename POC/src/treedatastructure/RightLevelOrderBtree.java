/**
 * 
 */
package treedatastructure;

import java.util.Stack; 

/**
 * @author 212720190
 * @date Sep 7, 2019
 */
public class RightLevelOrderBtree {

	Node root;

	static class Node {
		Node left,right;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	static void printRightLevel(Node root) {
		Stack<Node> stk = new Stack<>(); 
		stk.add(root);

		while(!stk.isEmpty()) {
			int count = stk.size();
			if(count==0)break;
			while(count>0) {
				Node node = stk.pop();
				System.out.print(node.data+" ");
				if(node.left !=null)
					stk.add(node.left);

				if(node.right !=null)
					stk.add(node.right);
				count--;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		RightLevelOrderBtree obj = new RightLevelOrderBtree();
		obj.root = new Node(10);
		obj.root.left = new Node(12);
		obj.root.right = new Node(15);
		obj.root.left.left = new Node(20);
		obj.root.left.right = new Node(22);

		printRightLevel(obj.root);
	}

}
