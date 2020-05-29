package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Jan 18, 2020
 */
public class LongestIncreasingSubsequence {

	
	public static void main(String[] args) {

		int[] arr = {12, 8, 11, 13, 10, 15, 16, 14, 6};
		int[] dp = new int[arr.length];
			Arrays.fill(dp,1);
			
			for(int i=1;i<arr.length;i++) {	
				for(int j=0;j<i;j++) {	
					if(arr[i]>arr[j]) {
						dp[i]=Math.max(dp[j]+1,dp[i]);
					}
				}
			}
			int max = Integer.MIN_VALUE;
			for(int i=0;i<dp.length;i++) {
				max = Math.max(dp[i], max);
			}
			System.out.println(max);
	}

}
