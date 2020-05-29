/**
 * 
 */
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
public class SubArrayZeroSum {

	/*Given an numsay nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
	Find all unique triplets in the numsay which gives the sum of zero.*/
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(nums));
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		if(nums.length==0 || nums.length<3)
			return new ArrayList<>();
		Set<List<Integer>> list = new HashSet<>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length-2;i++) {
			int j=i+1;
			int k=nums.length-1;
			while(j<k) {
				if(nums[i]+nums[j]+nums[k]==0) {
					List<Integer> subList = new ArrayList<>();
					subList.add(nums[i]);
					subList.add(nums[j]);
					subList.add(nums[k]);
					list.add(subList);
					j++;
					k--;
				}
				else if(nums[i]+nums[j]+nums[k]>0){
					k--;
				} else {
					j++;
				}
			}
		}
		return new ArrayList<>(list);
	}
}
