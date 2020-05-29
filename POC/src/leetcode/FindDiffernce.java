/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Mar 29, 2020
 */
public class FindDiffernce {

	//389 find the difference
	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		int i=0;int j=0;
		int[] arr = new int[26];
		while(i<s.length() || j<t.length()) {
			if(i<s.length()) {
				arr[s.charAt(i)-'a']++;
			}
			if(j<t.length()) {
				arr[t.charAt(j)-'a']--;
			}
			i++;
			j++;
		}
		for(int m=0;m<arr.length;m++) {
			if(arr[m]!=0) {
				System.out.println((char)m);
			}
		}

	}

}
