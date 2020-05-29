/**
 * 
 */
package treedatastructure;

/**
 * @author 212720190
 * @date Apr 4, 2019
 */
public class BinaryTree {

	InorderBtreeWithoutRecursion root;

	public void inOrderTraversal(InorderBtreeWithoutRecursion root) {
		InorderBtreeWithoutRecursion current, previous;

		if(root==null) {
			return;
		}
		current = root;
		while(current != null) {
			if(current.left == null) {
				System.out.println(current.data+" ");
				current = current.right;
			}
			else {
				previous = current.left;
				while (previous.right !=null && previous.right !=current) 
					previous = previous.right;

				if(previous.right== null) {
					previous.right = current;
					current = current.left;
				}

				else { 
					previous.right = null; 
					System.out.print(current.data + " "); 
					current = current.right; 
				}

			}
		}
	}

	public static void main(String args[]) 
    { 
        BinaryTree tree = new BinaryTree(); 
        tree.root = new InorderBtreeWithoutRecursion(1); 
        tree.root.left = new InorderBtreeWithoutRecursion(2); 
        tree.root.right = new InorderBtreeWithoutRecursion(3); 
        tree.root.left.left = new InorderBtreeWithoutRecursion(4); 
        tree.root.left.right = new InorderBtreeWithoutRecursion(5); 
  
        tree.inOrderTraversal(tree.root); 
    } 
}
