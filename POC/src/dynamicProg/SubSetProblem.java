package dynamicProg;

/**
 * @author 212720190
 * @date Jan 26, 2020
 */
public class SubSetProblem {

	public static void main(String[] args) {

		int[] arr = {2,5,6,8};
		int sum=11;
		boolean[][] dp = new boolean[arr.length+1][sum+1];
		
		for(int i=0;i<arr.length;i++) {
			dp[i][0]=true;
		}
		
		for(int i=1;i<=arr.length;i++) {
			for(int j=1;j<=sum;j++) {
				 if(j<arr[i-1]) {
					dp[i][j]=dp[i-1][j];
				} else {
					dp[i][j]= dp[i-1][j] || dp[i-1][j-arr[i-1]];
				}
			}
		}
		System.out.println(dp[arr.length][sum]);
		
	}

}
