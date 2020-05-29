/**
 * 
 */
package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Dec 15, 2019
 */
public class ReplaceByLargestFromRight {


	public static void main(String[] args) {
		
		int[] arr = {4,7,10,1,9};
		int temp = arr[arr.length-1];
		arr[arr.length-1]=-1;
		
		for(int j=arr.length-2;j>=0;j--) {
			int temp_curr = arr[j];
			arr[j]=temp;
			 temp = Math.max(temp, temp_curr);
		}
		System.out.println(Arrays.toString(arr));
	}

}
