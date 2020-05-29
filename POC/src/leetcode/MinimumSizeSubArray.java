/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Apr 15, 2020
 */
public class MinimumSizeSubArray {

	//209. Minimum Size Subarray Sum
	/*Given an array of n positive integers and a positive integer s, 
	find the minimal length of a contiguous subarray of which the sum ≥ s.
	If there isn't one, return 0 instead.
	Example:
	Input: s = 7, nums = [2,3,1,2,4,3]
	Output: 2
	Explanation: the subarray [4,3] has the minimal length under the problem constraint.*/
	public static void main(String[] args) {
		
		int[] nums = {2,3,1,2,4,3};
		int s=7;
		int current=0;
		int left=0;
		int right=0;
		int min = Integer.MAX_VALUE;
		while(left<nums.length) {
			while(current<s &&right<nums.length) {
				current+=nums[right];
				right++;
			}
			if(current>=s) {
				min=Math.min(min, right-left);
				current-=nums[left];
			}
			left++;
		}
		
		System.out.println(min);
	}

}
