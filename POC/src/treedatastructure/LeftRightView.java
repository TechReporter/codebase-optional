/**
 * 
 */
package treedatastructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 212720190
 * @date Dec 21, 2019
 */
public class LeftRightView {
	Node root;

	static class Node {
		Node left,right;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	static void leftView(Node root) {
		Queue<Node> q = new LinkedList<>(); 
		q.add(root);

		while(!q.isEmpty()) {
			int size = q.size();
			int i=size;
			while(i>0) {
 				Node val = q.poll();
				if(i==size)
					System.out.print(val.data+" ");

				if(val.left !=null) {
					q.add(val.left);
				}
				if(val.right !=null) {
					q.add(val.right);
				}
				i--;
			}
			System.out.println();
		}
	}
	
	static void rightView(Node root) {
		Queue<Node> q = new LinkedList<>(); 
		q.add(root);

		while(!q.isEmpty()) {
			int size = q.size();
			while(size>0) {
 				Node val = q.poll();
				if(size==1)
					System.out.print(val.data+" ");

				if(val.left !=null) {
					q.add(val.left);
				}
				if(val.right !=null) {
					q.add(val.right);
				}
				size--;
			}
		}
	}
	public static void main(String[] args) {

		LeftRightView obj = new LeftRightView();
		obj.root = new Node(10);
		obj.root.left = new Node(12);
		obj.root.right = new Node(15);
		obj.root.left.left = new Node(20);
		obj.root.left.right = new Node(22);
		obj.root.left.right.left = new Node(17);
		obj.root.left.right.right = new Node(23);

		leftView(obj.root);
		System.out.println("--------");
		rightView(obj.root);
	}

}
