/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Nov 9, 2019
 */
public class CheckStringPlaindrom {

	public static void main(String[] args) {

		String str = "geskkkssdages";
		int count = 0;
		int[] chr = new int[26];
		for(int i=0; i<str.length();i++) {
			chr[str.charAt(i)-'a']++;
		}
		for(int j=0;j<26;j++) {
			if(chr[j]%2!=0) {	
				count++;
			}
		}
		if(count>1)
			System.out.println("cannot be palindrom");
		else
			System.out.println("yes palindrom");
	}

}
