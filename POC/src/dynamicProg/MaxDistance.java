package dynamicProg;

/**
 * @author 212720190
 * @date Jan 23, 2020
 */

//max path from bottom left to top right
public class MaxDistance {

	public static void main(String[] args) {
		int[][] arr = {{1,1,1,1,1},
				{1,0,1,0,1},
				{1,0,1,0,1},
				{1,1,1,1,1}};
		
		int row =arr.length;
		int col = arr[0].length;
		int[][] dp = new int[row][col];
		
		dp[row-1][0] = arr[row-1][0];
		
		for(int i = 1;i<col;i++) {
			dp[row-1][i] = arr[row-1][i]+dp[row-1][i-1];
		}
		
		for(int i = row-2;i>=0;i--) {
			dp[i][0] = arr[i][0]+dp[i+1][0];
		}
		
		for(int i=row-2;i>=0;i--) {
			for(int j=1;j<col;j++) {
				dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j])+arr[i][j];
			}
		}
		System.out.println(dp[0][col-1]);
	}

}
