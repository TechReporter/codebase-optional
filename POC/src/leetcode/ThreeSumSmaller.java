/**
 * 
 */
package leetcode;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Apr 10, 2020
 */
public class ThreeSumSmaller {

	/*Given an array of n integers nums and a target, find the number of index triplets i, j, k
	with 0 <= i < j < k < n that satisfy the condition nums[i] + nums[j] + nums[k] < target.
			For example, given nums = [-2, 0, 1, 3], and target = 2.
			Return 2. Because there are two triplets which sums are less than 2:*/
	public static void main(String[] args) {
		// can be done in O(n^2)
		int[] arr = {-2,0,1,3};
		int k=2;
		Arrays.sort(arr);
		int result=0;
		for(int i=0;i<arr.length-2;i++) {
			int j=i+1;
			int m=arr.length-1;
			while(j<m) {
				if(arr[i]+arr[j]+arr[m]<k) {
					result+=m-j;
					j++;
				} else
					m--;	
			}
		}
		System.out.println(result);
	}

}
