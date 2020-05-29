/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Dec 6, 2019
 */
public class LeftRotateArray {

	//left rotate array by K times
	public static void main(String[] args) {

		int[] arr = {2,4,5,7,9};
		int k=6;
		int rotate = k%arr.length;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[(i+rotate)%arr.length]);
		}
	}

}
