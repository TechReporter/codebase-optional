package datastructure;

import java.math.BigInteger;

/**
 * @author 212720190
 * @date May 26, 2019
 */
public class FindAllSubsequenceArray {

	
	public static void main(String[] args) {
//no. of total subsequence  (2^n-1) 
		int[] arr = {3,2,6,8,4,9};
		
		for(int i=1;i<Math.pow(2, arr.length);i++) {
			for(int j=0;j<arr.length;j++) {
				if(BigInteger.valueOf(i).testBit(j)) {
					System.out.print(arr[j]+" ");
				}
			}
			System.out.println();
		}
	}

}
