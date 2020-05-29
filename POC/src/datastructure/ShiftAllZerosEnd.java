/**
 * 
 */
package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Apr 30, 2019
 */
public class ShiftAllZerosEnd {

	public static void main(String[] args) {

		int[] arr = {0,0,3,7,0,1,0,1,0};
		int k = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr[k++] = arr[i];
			}
		}
		for(int i = k-1; i<arr.length-1;i++) {
			arr[k++] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}
}
