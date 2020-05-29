/**
 * 
 */
package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date May 29, 2019
 */
public class MoveAllZeroesToRight {

	// shift all zeroes to right in single traversal using swapping
	public static void main(String[] args) {

		int[] arr = {2,1,0,0,4,0,6};
		int count =0;
		int temp =0;
		for(int i=0;i<arr.length;i++) {

			if(arr[i] !=0) {
				temp=arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count+=1;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
