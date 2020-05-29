package tempPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 212720190
 * @date Apr 13, 2020
 */
public class ZigzagTreeTraversal {
	Node root;

	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}

	}

	static List<List<Integer>> zigzagTree(Node root) {
		if(root==null)
			return null;
		List<List<Integer>> res = new ArrayList<>();
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		boolean flag=true;
		while(!q.isEmpty()) {
			int i=q.size();
			LinkedList<Integer> list = new LinkedList<>();
			while(i>0) {
				Node n=q.poll();
				if(flag)
					list.add(n.data);
				else
					list.addFirst(n.data);
				if(n.left!=null)
					q.add(n.left);
				if(n.right!=null)
					q.add(n.right);
			i--;
			}
			res.add(list);
			flag=!flag;
		}

		return res;
	}

	//using single queue
	public static void main(String[] args) {
		ZigzagTreeTraversal tree = new ZigzagTreeTraversal(); 
		tree.root = new Node(4); 
		tree.root.left = new Node(1); 
		tree.root.right = new Node(7); 
		tree.root.right.left = new Node(5); 
		tree.root.right.right = new Node(8); 
		tree.root.right.right.left = new Node(10); 
		tree.root.right.right.right = new Node(11); 
		tree.root.left.left = new Node(14); 
		tree.root.left.right = new Node(18); 
		tree.root.left.right.left = new Node(15); 
		tree.root.left.right.right = new Node(19); 
		
		zigzagTree(tree.root);
	}

}
