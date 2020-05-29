/**
 * 
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Mar 30, 2020
 */
public class MajorityElement {

	//169 majority element
	/*Given an array of size n, find the majority element. 
	The majority element is the element that appears more than ⌊ n/2 ⌋ times.

	You may assume that the array is non-empty and the majority 
	element always exist in the array.*/
	public static void main(String[] args) {
		int[] arr = {2,2,1,1,1,2,2};
		int sizeHalf = arr.length/2;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i])>sizeHalf) {
				System.out.println(arr[i]);
				break;
			}
		}
		System.out.println(getMajority(arr));
	}

	//another way
	static int getMajority(int[] nums) {
		int candidate = nums[0], count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (count == 0) {
				count++;
				candidate = nums[i];
			} else {
				if (nums[i] == candidate) 
					count++;
				else count--;
			}
		}
		return candidate;
	}
}
