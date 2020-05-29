/**
 * 
 */
package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Jul 10, 2019
 */
public class CircularArrayRotation {

	
	public static void main(String[] args) {
		int[] arr = {5,3,6,2};
		int k=2;
		while(k>0) {
			int temp = arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=temp;
			k--;
		}
	
		System.out.println(Arrays.toString(arr));

	}

}
