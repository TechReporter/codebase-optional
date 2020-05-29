/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 1, 2020
 */
public class MaxSubSquareMatrix {


	public static void main(String[] args) {
		int[][] mat = {{0, 1, 1, 0, 1},  
				{1, 1, 0, 1, 0},  
				{0, 1, 1, 1, 0}, 
				{1, 1, 1, 1, 0}, 
				{1, 1, 1, 1, 1}, 
				{0, 0, 0, 0, 0}};

		int[][] dp= new int[mat.length+1][mat[0].length+1];
		for(int i=1;i<mat.length;i++) {
			for(int j=1;j<mat[0].length;j++) {
				if(mat[i][j]==1)
					dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i][j-1], dp[i-1][j-1]))+1;
				else {
					dp[i][j]=0;
				}
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i=1;i<mat.length;i++) {
			for(int j=1;j<mat[0].length;j++) {
				max = Math.max(max, dp[i][j]);
			}
		}
		System.out.println(max);
	}

}
