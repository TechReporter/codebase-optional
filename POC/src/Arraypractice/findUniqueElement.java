/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Feb 28, 2020
 */
public class findUniqueElement {

	//find unique element, where all other element occurred twice 
	public static void main(String[] args) {

		// using XOR is best approach
		//a) XOR of a number with itself is 0.
	//b) XOR of a number with 0 is number itself.
		int[] arr = {3,2,1,1,6,3,6};
		
		int xor =0;
		for(int i=0;i<arr.length;i++) {
			xor = arr[i]^xor;
		}
		System.out.println(xor);
	}

}
