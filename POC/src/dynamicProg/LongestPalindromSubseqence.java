package dynamicProg;

/**
 * @author 212720190
 * @date Feb 3, 2020
 */
public class LongestPalindromSubseqence {

	public static void main(String[] args) {

		String s = "agbdba";
		int[][] dp = new int[s.length()][s.length()];
		
		for(int i=2;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				int l=i+j-1;
				if(i==2 && s.charAt(j)==s.charAt(l))
					dp[j][l]=2;
				if(s.charAt(j)==s.charAt(l)) {
					dp[j][l] = dp[j+1][l-1]+2;
				} else {
					dp[j][l] = Math.max(dp[j][l-1], dp[j+1][l]);
				}
			}
		}
		System.out.println(dp[0][s.length()-1]);
	}

}
