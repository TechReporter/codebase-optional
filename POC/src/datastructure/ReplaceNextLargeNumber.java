/**
 * 
 */
package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date May 29, 2019
 */
//replace current element with its largest element find till then in right 
public class ReplaceNextLargeNumber {
// it should be {19,19,19,12,-1}
	public static void main(String[] args) {
		int[] arr = {3,5,2,19,12};
		int max_elem = arr[arr.length-1];
		arr[arr.length-1] = -1;
		
		for(int i = arr.length-2;i>=0;i--) {
			int temp = arr[i];
			arr[i]=max_elem;
			max_elem = Math.max(temp, max_elem);
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
