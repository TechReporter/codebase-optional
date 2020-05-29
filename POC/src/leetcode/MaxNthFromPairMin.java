package leetcode;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Jul 28, 2019
 */
public class MaxNthFromPairMin {

	public static void main(String[] args) {
		int[] nums = {1,4,3,2,7,9,8,6};//{1,2,3,4,7,9}
        Arrays.sort(nums);
        int result=0;
        int k=0;
        int i=0;
        while(k<nums.length/2) {
            result+=Math.min(nums[i],nums[i+1]);
            i+=2;
            k++;
        }
        System.out.println(result);
    
	}

}
