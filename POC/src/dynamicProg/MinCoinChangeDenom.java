package dynamicProg;

/**
 * @author 212720190
 * @date Feb 8, 2020
 */

//minimum no. of coin denominatio required to reach total.
public class MinCoinChangeDenom {


	public static void main(String[] args) {
		int[] arr = {1,5,6,8};
		int sum = 11;
		int[][] dp = new int[arr.length+1][sum+1];
	
		for(int i=0;i<arr.length;i++) {
			dp[i][0]=0;
		}

		for(int i=0;i<=sum;i++) {
			dp[0][i]=Integer.MAX_VALUE;
		}
		
		for(int i=1;i<=arr.length;i++) {
			for(int j=1;j<=sum;j++) {
				if(j<arr[i-1]) {
					dp[i][j]=dp[i-1][j];
				}
				else {
					dp[i][j]=Math.min(dp[i-1][j], 1+dp[i][j-arr[i-1]]);
				}
			}
		}
		System.out.println(dp[arr.length][sum]);
	}

}
