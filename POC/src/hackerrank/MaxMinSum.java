/**
 * 
 */
package hackerrank;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Mar 7, 2020
 */
public class MaxMinSum {


	public static void main(String[] args) {
		int[] arr = {793810624, 895642170, 685903712, 623789054, 468592370};
		Arrays.sort(arr);
        long total=0;
        for(int i=0;i<arr.length;i++) {
            total+=arr[i];
        }
        System.out.print((total-arr[arr.length-1])+" "+(total-arr[0]));
	}

}
