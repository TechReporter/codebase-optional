/**
 * 
 */
package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date May 5, 2019
 */
public class ReplaceElementsProduct {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int[] left_arr = new int[array.length];
		int[] right_arr = new int[array.length];
		
		left_arr[0] = 1;
		for(int i = 1;i<array.length;i++) {
			left_arr[i] = left_arr[i-1]*array[i-1];
		}
		
		right_arr[array.length-1] = 1;
		for(int j=array.length-2;j>=0;j--) {
			right_arr[j] = right_arr[j+1]*array[j+1];
		}
			for(int i = 0;i<array.length;i++) {
				array[i] = right_arr[i]*left_arr[i];
			}
			
			System.out.println(Arrays.toString(array));
	}

}
