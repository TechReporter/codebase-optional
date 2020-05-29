package datastructure;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrintLevelOrderTreeWithQueue {

	int data;
	PrintLevelOrderTreeWithQueue left = null,right = null; 

	public PrintLevelOrderTreeWithQueue(int data) {
		this.data = data;
	}

	public static void main(String[] args) {
		PrintLevelOrderTreeWithQueue root = new PrintLevelOrderTreeWithQueue(10);
		root.left = new PrintLevelOrderTreeWithQueue(13);
		root.right = new PrintLevelOrderTreeWithQueue(8);
		root.left.left = new PrintLevelOrderTreeWithQueue(6);
		root.left.right = new PrintLevelOrderTreeWithQueue(20);
		root.right.left = new PrintLevelOrderTreeWithQueue(16);
		root.right.right = new PrintLevelOrderTreeWithQueue(30);

		levelOrderTreeTraverse(root);
	}

	static void levelOrderTreeTraverse(PrintLevelOrderTreeWithQueue root) {
		PrintLevelOrderTreeWithQueue pointer;

		Queue<PrintLevelOrderTreeWithQueue> queue = new ArrayDeque<>();
		queue.add(root);

		while(!queue.isEmpty()) {
			pointer = queue.poll();
			System.out.println(pointer.data+" ");
			if(pointer.left !=null) {
				queue.add(pointer.left);
			}
			if(pointer.right !=null) {
				queue.add(pointer.right);
			}
		}

	}

}
