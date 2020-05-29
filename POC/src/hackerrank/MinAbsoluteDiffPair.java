/**
 * 
 */
package hackerrank;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Mar 28, 2020
 */
public class MinAbsoluteDiffPair {

	//hackerrank
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,-7,0};
		int min = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			min = Math.min(Math.abs(arr[i]-arr[i+1]),min);
		}
		System.out.println(min);
	}

}
