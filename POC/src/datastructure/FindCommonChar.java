/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Jul 2, 2019
 */
public class FindCommonChar {

	//find common character in two string
	public static void main(String[] args) {

		String s1 = "abcd";
		String s2 = "aab";
		int[] arr = new int[26];
		int count=0;
		for(int i=0;i<s1.toCharArray().length;i++) {
			arr[s1.toCharArray()[i]-'a']++;
		}

		for(int j=0;j<s2.toCharArray().length;j++) {
			arr[s2.toCharArray()[j]-'a']++;
		}

		for(int i=0;i<26;i++) {
			if(arr[i]>1) {
				System.out.println((char)(i+97));
				count++;
			}
		}
		System.out.println(count);
	}

}
