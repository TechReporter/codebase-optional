package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 212720190
 * @date Apr 10, 2020
 */
public class ThreeSumClosest {
	//16. 3 sum closest
	/*	Given an array nums of n integers and an integer target, find three integers in nums
	such that the sum is closest to target. Return the sum of the three integers. 
	You may assume that each input would have exactly one solution.*/
	public static void main(String[] args) {

		int[] nums = {-1, 2, 1, -4};
		int target = 1;
		int min = Integer.MAX_VALUE;
		Arrays.sort(nums);
		int finalSum=0;
		int current=0;
		for(int i=0;i<nums.length-2;i++) {
			int j=i+1;
			int k=nums.length-1;
			while(j<k) {
				int sum = Math.abs(nums[i]+nums[j]+nums[k]);
				if(sum==target) {
					break;
				}
				current = Math.abs(target-sum);
				if (current < min) {
					min = current;
					finalSum = sum;
				}

				if (sum < target) {
					++j;
				} else {
					--k;
				}
			}
		}
		System.out.println(finalSum);
	}
}
