/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date May 28, 2019
 */
public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String str = "transportation";
		char[] chr = str.toCharArray();
		int[] arr = new int[26];
		for(int i=0;i<chr.length;i++) {
			arr[chr[i]-'a']++;
		}
		
		for(int i=0;i<chr.length;i++) {
			if(arr[chr[i]-'a']==1) {
				System.out.println(chr[i]);
				break;
			}
		}
	}

}
