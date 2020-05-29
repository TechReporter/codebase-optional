/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 1, 2020
 */
public class TotalWaysToReachBottom {


	//total no. ways to reach from top to bottom in maze, can traverse, top, bottom diagonal
	public static void main(String[] args) {
		int[][] arr = {{3,2,1,5},
				{1,2,5,4},
				{7,6,3,5},
				{8,0,1,8}};

		int[][] dp = new int[arr.length][arr[0].length];
		//fill first row
		for(int i=0;i<arr.length;i++) {
			dp[0][i] = 1;
		}
		//fill first col
		for(int i=0;i<arr[0].length;i++) {
			dp[i][0] = 1;
		}

		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr[0].length;j++)
				dp[i][j] = dp[i-1][j-1]+dp[i-1][j]+dp[i][j-1];
		}
		System.out.println(dp[arr.length-1][arr[0].length-1]);
	}
}
