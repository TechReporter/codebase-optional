/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Jun 2, 2019
 */
public class LastDuplicateElement {

	// find index of last occurrence of duplicate element
	public static void main(String[] args) {

		int[] arr = {2,2,4,5,5,7,12,10};
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i]==arr[i-1]) {
				System.out.println("index "+i);
				break;
			}
		}
	}

}
