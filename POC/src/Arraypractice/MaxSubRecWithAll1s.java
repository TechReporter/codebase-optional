package Arraypractice;

/**
 * @author 212720190
 * @date Feb 27, 2020
 */
public class MaxSubRecWithAll1s {

	//print max sub-rectangle with all 1's
	public static void main(String[] args) {

		int[][] mat = {{0, 1, 1, 0, 1},  
				{1, 1, 0, 1, 0},  
				{0, 1, 1, 1, 0}, 
				{1, 1, 1, 1, 0}, 
				{1, 1, 1, 1, 1}, 
				{0, 0, 0, 0, 0}};

		int[][] dp= new int[mat.length][mat[0].length];
		//first row copy
		for(int i=0;i<mat[0].length;i++) {
			dp[0][i]=mat[0][i];
		}
		//first col copy
		for(int i=0;i<mat.length;i++) {
			dp[i][0]=mat[i][0];
		}
		for(int i=1;i<mat.length;i++) {
			for(int j=1;j<mat[0].length;j++) {
				if(mat[i][j]==1) {
					dp[i][j] = Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]))+1;
				}
				else
					dp[i][j]=0;
			}
		}

		int max_sub=dp[0][0];
		int row_index=0;
		int col_index=0;

		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(max_sub<dp[i][j]) {
					max_sub=Math.max(max_sub, dp[i][j]);
					row_index=i;
					col_index=j;
				}

			}
		}

		for(int i = row_index; i>row_index - max_sub; i--) {
			for(int j = col_index; j > col_index - max_sub; j--) {
				System.out.print(mat[i][j] + " "); 
			}
			System.out.println(); 
		}  
	}

}
