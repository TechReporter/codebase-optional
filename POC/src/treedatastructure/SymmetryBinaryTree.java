package treedatastructure;

/**
 * @author 212720190
 * @date Jan 5, 2020
 */
public class SymmetryBinaryTree {

	int data;
	SymmetryBinaryTree left,right;

	public SymmetryBinaryTree(int data) {
		this.data = data;
	}

	static boolean checkSymmetry(SymmetryBinaryTree root) {
		return checkIfEqual(root.left, root.right);
	}
	// need to optimize
	static boolean checkIfEqual(SymmetryBinaryTree root,SymmetryBinaryTree root1) {
		if(root==null && root1==null) {
			return true;
		}
		if(root!=null && root1!=null) {
			return (checkIfEqual(root.left, root1.right) && checkIfEqual(root.right,root1.left));
		}
		return false;
	}
	
	static boolean checkMirror(SymmetryBinaryTree root) {
		if(root==null)
			return false;
		return checkMirrorTree(root.left, root.right);
	}

	static boolean checkMirrorTree(SymmetryBinaryTree root, SymmetryBinaryTree root1) {
	if(root==null && root1 == null)
		return true;
	
	if(root!=null && root1!=null) {
		return checkMirrorTree(root.left, root1.right) && checkMirrorTree(root.right, root1.left)
				&& (root.data==root1.data);
	}
	else
	return false;
	
	}
	
	public static void main(String[] args) {

		SymmetryBinaryTree tree1 = new SymmetryBinaryTree(10);
		tree1.left = new SymmetryBinaryTree(13);
		tree1.right = new SymmetryBinaryTree(13);
		tree1.left.left = new SymmetryBinaryTree(3);
		tree1.left.right = new SymmetryBinaryTree(20);
		tree1.right.left = new SymmetryBinaryTree(20);
		tree1.right.right = new SymmetryBinaryTree(3);

		if(checkSymmetry(tree1))
			System.out.println("same");
		else
			System.out.println("not same");
		
		System.out.println(checkMirror(tree1));
	}

}
