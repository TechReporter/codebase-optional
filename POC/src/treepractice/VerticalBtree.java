/**
 * 
 */
package treepractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author 212720190
 * @date Jan 24, 2020
 */
public class VerticalBtree {
	Node root;

	static class Node {
		Node left,right;
		int data;

		Node(int data) {
			this.data = data;
		}
	}
	static Map<Integer, List<Node>> map = new TreeMap<>();	


	static void vertical(Node node,int hd) {
		if(node == null)
			return;
		if(map.get(hd)!=null) {
			List<Node> list = map.get(hd);
			list.add(node);
			map.put(hd, list);
		} else {
			List<Node> list = new ArrayList<>();
			list.add(node);
			map.put(hd, list);
		}
		if(node.left!=null && node.right!=null) {
			vertical(node.left, hd-1);
			vertical(node.right, hd+1);

		}
	}

	public static void main(String[] args) {
		VerticalBtree obj = new VerticalBtree();
		obj.root = new Node(10);
		obj.root.left = new Node(12);
		obj.root.right = new Node(15);
		obj.root.left.left = new Node(20);
		obj.root.left.right = new Node(22);

		vertical(obj.root,0);
	}

}
