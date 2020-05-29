/**
 * 
 */
package treedatastructure;

/**
 * @author 212720190
 * @date Jun 8, 2019
 */
public class IfTwoBinaryTreeIdentical {

	int data;
	IfTwoBinaryTreeIdentical left,right;
	
	public IfTwoBinaryTreeIdentical(int data) {
		this.data = data;
	}
	
	// need to optimize
	static boolean checkIfEqual(IfTwoBinaryTreeIdentical tree1, IfTwoBinaryTreeIdentical tree2) {
		if(tree1==null || tree2==null)
			return false;
		if((tree1 !=null && tree2 !=null) && (tree1.data==tree2.data)
				&& checkIfEqual(tree1.left,tree2.left) && checkIfEqual(tree1.right, tree2.right))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		IfTwoBinaryTreeIdentical tree1 = new IfTwoBinaryTreeIdentical(10);
		tree1.left = new IfTwoBinaryTreeIdentical(13);
		tree1.right = new IfTwoBinaryTreeIdentical(14);
		tree1.left.left = new IfTwoBinaryTreeIdentical(3);
		tree1.left.left.right = new IfTwoBinaryTreeIdentical(20);
		tree1.right.left = new IfTwoBinaryTreeIdentical(25);

		IfTwoBinaryTreeIdentical tree2 = new IfTwoBinaryTreeIdentical(10);
		tree2.left = new IfTwoBinaryTreeIdentical(13);
		tree2.right = new IfTwoBinaryTreeIdentical(14);
		tree2.left.left = new IfTwoBinaryTreeIdentical(3);
		tree2.left.left.right = new IfTwoBinaryTreeIdentical(20);
		tree2.right.left = new IfTwoBinaryTreeIdentical(25);
		
		if(checkIfEqual(tree1,tree2))
			System.out.println("same");
		else
		System.out.println("not same");
	}

}
