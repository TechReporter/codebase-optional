package dynamicProg;

/**
 * @author 212720190
 * @date Feb 4, 2020
 */
public class KnapSackProblem {


	public static void main(String[] args) {
		int val[] = {60, 100, 120}; 
	    int wt[] = {10, 20, 30}; 
	    int  weight = 50; 
	    int n = val.length;
	    
	    int[][] dp = new int[n+1][weight+1];
	    
	    for(int i=0;i<=n;i++) {
	    	for(int j=0;j<=weight;j++) {
	    		if(i==0 || j==0) {
	    			dp[i][j]=0;
	    		} else if(wt[i-1]<=weight) {
	    			dp[i][j] = Math.max(dp[i-1][j], (val[i-1]+dp[i-1][weight-wt[i-1]]));
	    		} else {
	    			dp[i][j] = dp[i-1][j];
	    		}
	    	} 
	    }
	    System.out.println(dp[n][weight]);
	}

}
