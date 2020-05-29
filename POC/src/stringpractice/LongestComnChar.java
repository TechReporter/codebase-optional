/**
 * 
 */
package stringpractice;

/**
 * @author 212720190
 * @date Mar 1, 2020
 */
public class LongestComnChar {

	//longest common character between two string in alphabetical order
	public static void main(String[] args) {

		String s1 = "bzbdda";
		String s2 = "caadz";
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
	
		for(int i=0;i<s1.length();i++) {
			arr1[s1.charAt(i)-'a']++;
		}
		for(int i=0;i<s2.length();i++) {
			arr2[s2.charAt(i)-'a']++;
		}
		int k=0;
		while(k<26) {
			if(arr1[k]!=0 && arr2[k]!=0) {	
				int count=Math.min(arr1[k], arr2[k]);
				while(count>0) {
					System.out.print((char)(k+97));
					count--;
				}
			}
			k++;
		}
	}

}
