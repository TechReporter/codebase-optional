package treedatastructure;

import java.util.Arrays;
import java.util.Queue;

/**
 * @author 212720190
 * @date Jan 14, 2020
 */
public class SerializationDeserialiationTree {
	Node root;
	static class Node {
		int data;
		Node left,right;

		public Node(int data) {
			this.data = data;
			this.left=right=null;
		}
	}
	
	static String serialize(Node root) {
		if(root==null)
			return "x,";
		String leftSer = serialize(root.left);
		String rightSer = serialize(root.right);
		return root.data+","+leftSer+rightSer;		
		
	}
	
	static Node deSerialize(String str) {
		Queue<String> q = new java.util.LinkedList();
		q.addAll(Arrays.asList(str.split(",")));
		return deserializeHelper(q);
	}
	static Node deserializeHelper(Queue<String> q) {
		String val = q.poll();
		if(val=="x")
			return null;
		
		Node node = new Node(Integer.valueOf(val));
		node.left = deserializeHelper(q);
		node.right = deserializeHelper(q);
		return node;
	}
	
	public static void main(String[] args) {
		SerializationDeserialiationTree tree = new SerializationDeserialiationTree();
		tree.root = new Node(-15); 
		tree.root.left = new Node(5); 
		tree.root.right = new Node(6); 
		tree.root.left.left = new Node(-8); 
		tree.root.left.right = new Node(1);
		
		System.out.println(serialize(tree.root));
		System.out.println(deSerialize(serialize(tree.root)));
	}

}
