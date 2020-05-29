package matrixPrlbs;

/**
 * @author 212720190
 * @date Jan 8, 2020
 */
public class MinimumCostPath {

	public static void main(String[] args) {
		int arr[][] = {{1,3,5,8}, 
				{4,2,1,7}, 
				{4,3,2,3}};
		
		int dp[][]= new int[arr.length][arr[0].length];
		dp[0][0] = arr[0][0];
		for(int i=1;i<arr[0].length;i++) {
			dp[0][i]=arr[0][i]+dp[0][i-1];
		}
		
		for(int j=1;j<arr.length;j++) {
			dp[j][0]=arr[j][0]+dp[j-1][0];
		}
		
		for(int i=1;i<arr[0].length-1;i++) {
			for(int j=1;j<=arr.length;j++) {
				dp[i][j] = arr[i][j]+Math.min(dp[i-1][j], dp[i][j-1]);
			}
		}
		// TODO: check traverse path in main list
		System.out.println("min cost path :: "+dp[arr.length-1][arr[0].length-1]);
	}

}
