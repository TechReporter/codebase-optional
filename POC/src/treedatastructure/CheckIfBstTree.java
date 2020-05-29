package treedatastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212720190
 * @date Jan 14, 2020
 */
public class CheckIfBstTree {
	Node root;
	
	static class Node {
		int data;
		Node left,right;

		public Node(int data) {
			this.data = data;
			this.left=right=null;
		}
	}
	
	static void checkBst(Node root, List<Integer> list) {
		if(root == null)
			return;
			  
			checkBst(root.left, list);
			list.add(root.data);
			checkBst(root.right,list);
	}
	
	//another way
	
	static boolean checkBst1(Node root, int min, int max) {
		if(root == null)
			return true;
		
		if(root.data<min || root.data>max)
			return false;
		
		return (checkBst1(root.left, min,root.data-1) &&
		checkBst1(root.right, root.data+1,max));
	}

	public static void main(String[] args) {

		
		CheckIfBstTree tree = new CheckIfBstTree(); 
		tree.root = new Node(10); 
		tree.root.left = new Node(6); 
		tree.root.right = new Node(12); 
		tree.root.left.left = new Node(3); 
		tree.root.left.right = new Node(8); 
		List<Integer> list = new ArrayList<Integer>();
		//checkBst(tree.root, list);
	/*	for(int i=1;i<list.size();i++) {
			if(list.get(i)<list.get(i-1)) {
				System.out.println(false);
			}
		}*/
		System.out.println(checkBst1(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE));
	}

}
