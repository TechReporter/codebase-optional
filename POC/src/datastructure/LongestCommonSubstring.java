/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Apr 10, 2019
 */
public class LongestCommonSubstring {

	public static void main(String[] args) {
		LongestCommonSubstring lcs = new LongestCommonSubstring();
		char str1[] = "abcdef".toCharArray();
        char str2[] = "zcdemf".toCharArray();
        System.out.println(lcs.findLongestCSubstring(str1, str2));
	}

	private int findLongestCSubstring(char str1[], char str2[]) {
		int res[][] = new int[str1.length][str2.length];

		int max = 0;

		for(int i=1;i<=str1.length;i++) {
			for(int j=1;j<str2.length;j++) {
				if(str1[i-1] == str2[j-1]) {
					res[i][j] = res[i-1][j-1]+1; // if same then res[i][j] is whatever we got excluding this,i. [i-1[j-1] +1;
												//for subsequence if match, it is same, if not match then max of exluding one 
					//character from one string or excluding one char from other string.[i-1][j] or [i][j-1] 

					if(max<res[i][j]) {  
						max = res[i][j];
					}
				}
			}

		}
		return max;
	}

}
