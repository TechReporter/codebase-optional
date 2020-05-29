/**
 * 
 */
package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Apr 30, 2019
 */
public class SortArraywithZerosOnesTwos {

	public static void main(String[] args) {

		int[] arr = {1,1,2,0,1,0,1,1,2,0,0,2,1,2,0};
		int zeros = 0;
		int ones = 0;
		int twos = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == 0) {
				zeros++;
			} else if(arr[i] == 1) {
				ones++;
			} else {
				twos++;
			}
		}
		int index = 0;
		while(zeros>0) {
			arr[index] = 0;
			zeros--;
			index++;
		}
		while(ones>0) {
			arr[index] = 1;
			ones--;
			index++;
		}
		while(twos>0) {
			arr[index] = 2;
			twos--;
			index++;
		}

		System.out.println(Arrays.toString(arr));
	}

}
