
package com;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Dec 31, 2018
 */
public class LargestContigiousSubarray {

	
	public static void main(String[] args) {
		int[] arr = {-1,2,4,-3,5,-4};
		System.out.println("largest possible sum :: "+findLargestSubArraySum(arr));
		
	}
	
	static int findLargestSubArraySum(int[] arr) {
		int maxSum = 0;
		int tempSum = 0;
		int startIndex = 0;
		int endIndex = 0;
		int temp = 0;
		for(int i = 0; i< arr.length; i++) {
			tempSum +=arr[i];
			
			if(tempSum < 0) {
				tempSum = 0;
				temp = i+1;
			}
		
			else if (maxSum < tempSum) {
				maxSum = tempSum;
				startIndex = temp;
				endIndex = i;
			}
			
		}
		System.out.println("Sum with largest contigious subArray"+Arrays.toString(findSubArray(startIndex,endIndex,arr)));
		
		return maxSum;
	}
	
	static int[] findSubArray(int i, int n, int[] arr) {
		int[] newArray = new int[n-i+1];
		int j = 0;
		for(int k = 0; k<arr.length; k++) {
			if(k == i || (k > i && k<n) || k == n) {
				newArray[j] = arr[k];
				j++;
			}
		}
		return newArray;
	}

}