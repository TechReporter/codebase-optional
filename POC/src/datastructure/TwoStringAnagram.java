package datastructure;

/**
 * @author 212720190
 * @date Jan 2, 2020
 */

//no. of character remove to make two string anagram
public class TwoStringAnagram {

	public static void main(String[] args) {

		String s1 = "tanmoy";  //1000001100100001001
		String s2 = "chinmoy";
		
		int[] s1_char = new int[26];
		int[] s2_char = new int[26];

		for(int i=0;i<s1.length();i++) {
			s1_char[s1.charAt(i)-'a']++;
		}
		
		for(int i=0;i<s2.length();i++) {
			s2_char[s2.charAt(i)-'a']++;
		}
		int count=0;
		for(int i=0;i<s2_char.length;i++) {
			count+=Math.abs(s1_char[i]-s2_char[i]);
		}
		System.out.println(count);
	}

}
