/**
 * 
 */
package com;

/**
 * @author 212720190
 * @date Apr 4, 2019
 */
public class GetPairCount {

	public static void main(String[] args) {

		int[] arr = {2,4,2,2,5,1,1,1,6,6,3,3,2};
		int pairSum = 0;
		for(int i =1; i<arr.length; i++) {
			if(arr[i]==arr[i-1]) {
				pairSum++;
			}
		}
		System.out.println(pairSum);
	}

	
}
