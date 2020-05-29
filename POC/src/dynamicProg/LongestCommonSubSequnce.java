/**
 * 
 */
package dynamicProg;

/**
 * @author 212720190
 * @date Mar 22, 2020
 */
public class LongestCommonSubSequnce {

	
	public static void main(String[] args) {

		char str1[] = "abcde".toCharArray();
        char str2[] = "ace".toCharArray();
        System.out.println(findLongestCSubstring(str1, str2));
	

	}
	
	static int findLongestCSubstring(char[] str1, char[] str2) {
		int[][] dp = new int[str1.length+1][str2.length+1];
		int max=0;
		
		for(int i=1;i<=str1.length;i++) {
			for(int j=1;j<=str2.length;j++) {
				if(str1[i-1]==str2[j-1]) {
					dp[i][j] = dp[i-1][j-1]+1;
				} else {
					dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]); //diff of substring and subseq is
					//for subseqnce if not match take max from excluding top/left, 
				}
				max=Math.max(max, dp[i][j]);
			}
		}
		return max;
		
	}

}
