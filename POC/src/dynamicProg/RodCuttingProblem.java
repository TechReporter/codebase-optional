package dynamicProg;

/**
 * @author 212720190
 * @date Jan 17, 2020
 */
public class RodCuttingProblem {

	static int maxProfit(int[] arr) {

		int[] dp = new int[arr.length+1];
		dp[0]=0;
		for(int i=1; i<=arr.length;i++) {
			int max = Integer.MIN_VALUE;
			for(int j=0;j<i;j++) {
				max = Math.max(max, arr[j]+arr[i-j-1]);
			}
			dp[i]=max;
		}
		return dp[arr.length];

	}
	public static void main(String[] args) {
		int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20}; 
		System.out.println(maxProfit(arr));
	}

}
