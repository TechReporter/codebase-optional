/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Jun 1, 2019
 */
public class MinCharDeleteToMakeAnagram {

	public static void main(String[] args) {
		String s1= "qcvdb";
		String s2= "asbc";
		int count =0;
		int[] chr = new int[26];
		for(int i=0;i<s1.length();i++) {
				chr[s1.charAt(i)-'a']++;
		}
		for(int i=0;i<s2.length();i++) {
			chr[s2.charAt(i)-'a']++;
		}
		
		for(int i=0;i<chr.length;i++) {
			if(chr[i]==1)
				count++;
		}
		System.out.println(count);
	}

}
