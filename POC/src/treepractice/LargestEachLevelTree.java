/**
 * 
 */
package treepractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author 212720190
 * @date Apr 1, 2020
 */
public class LargestEachLevelTree {
	static Node root;

	static class Node {
		int data;
		Node left,right;

		Node(int data) {
			this.data = data;
		}
	}

	static List<Integer> largestEachLevel(Node root) {
		if(root==null)
			return new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		Queue<Node> queue = new java.util.LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int max = -9999;
			int n=queue.size();
			while(n>0) {
				Node p = queue.poll();
				max = Math.max(max, p.data);
				if(p.left !=null)
					queue.add(p.left);
				if(p.right !=null)
					queue.add(p.right);	
				n--;
			}
			list.add(max);
		}
		return list;
	}

	public static void main(String[] args) {
		LargestEachLevelTree.root = new Node(10); 
		LargestEachLevelTree.root.left = new Node(7); 
		LargestEachLevelTree.root.right = new Node(3); 
		LargestEachLevelTree.root.left.right = new Node(5); 
		LargestEachLevelTree.root.left.left = new Node(4); 
		LargestEachLevelTree.root.right.left = new Node(2); 

		largestEachLevel(LargestEachLevelTree.root)
		.stream().forEach(System.out::println);
	}

}
