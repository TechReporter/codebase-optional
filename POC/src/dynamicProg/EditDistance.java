package dynamicProg;

/**
 * @author Tanmoy Dasgupta
 *
 */
public class EditDistance {
//form dp table,  initially for no character fill cell with till jow char length
	//if each caharacter match with till now last char, fill cell with diagonal value [i-1][j-1],
	//else take min of top, diag, left.
	public static void main(String[] args) {

		String a = "tanmoy";
		String b = "mani";
		int[][] dp = new int[a.length()+1][b.length()+1];
		
		for(int i=0;i<=b.length();i++) {
			dp[0][i]=i;
		}
		for(int i=0;i<=a.length();i++) {
			dp[i][0]=i;
		}
		
		for(int i=1;i<=a.length();i++) {
			for(int j=1;j<=b.length();j++) {
				
				if(a.charAt(i-1)==b.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1];
				}
				else {
					dp[i][j]=1+Integer.min(dp[i][j-1], Integer.min(dp[i-1][j], dp[i-1][j-1]));
				}
			}
		}
		System.out.println(dp[a.length()][b.length()]);
	}

}
