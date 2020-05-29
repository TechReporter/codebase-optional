/**
 * 
 */
package dynamicProg;

/**
 * @author 212720190
 * @date Feb 5, 2020
 */
public class SumTriangle {

	//sum triangle where num is addition of its immediate below to number.
	//2,5,4,1 -> 7,9,5->16,14->30
	public static void main(String[] args) {
		
		int[] arr = {2,5,4,1};
		int[][] dp = new int[arr.length][arr.length];
		
		for(int i=0;i<arr.length;i++) {
			dp[arr.length-1][i]=arr[i];
		}

		for(int i=arr.length-2;i>=0;i--) {
			for(int j=0;j<arr.length-1;j++) {
				dp[i][j] = dp[i+1][j]+dp[i+1][j+1];
			}
		}
		System.out.println(dp[0][0]);
	}

}
