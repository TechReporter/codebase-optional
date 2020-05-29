/**
 * 
 */
package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Jul 4, 2019
 */
public class RotateArray {
//O(n*d) time and O(1) space
	public static void main(String[] args) {
		int[] arr = {3,5,1,7,4};
		int rotate_count = 3;
		while(rotate_count>0) {
			int temp = arr[0];
			for(int i=0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
			rotate_count--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
