/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 24, 2020
 */
public class LngstSubStrWithOutRepeat {


	public static void main(String[] args) {
		String s = "abccbefghab";
		int maxLen = 0;
		String res ="";
		int[] visited = new int[26];
		int left=0;int right=0;
		for(;right<s.length();right++) {
			if(visited[s.charAt(right)-'a']!=0) {
				left = Math.max(left, right);
			} else {
				visited[s.charAt(right)-'a']++;
			}
			if(maxLen<right-left+1) {
				maxLen = right-left+1;
				res=s.substring(left, right+1);
			}
		}
		System.out.println(maxLen+" "+res);
	}

}
