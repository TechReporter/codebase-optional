/**
 * 
 */
package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Apr 29, 2019
 */
public class MaxProductOfPairArray {

	public static void main(String[] args) {

		int[] arr = {2,4,6,1,9,5};
		int length = arr.length;
		
		Arrays.sort(arr);
		int max_prod = 0;
			max_prod = arr[length-1]*arr[length-2];
			int first_val = arr[length-1];
			int second_val = arr[length-2];
		System.out.println(max_prod);
		System.out.println(first_val+" "+second_val);

	}

}
