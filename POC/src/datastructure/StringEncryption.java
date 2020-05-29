/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Dec 17, 2019
 */
public class StringEncryption {

	public static void main(String[] args) {

		String s= "character";
		int k=3;
		String res = "";
		int countVowels =0;
		int countConsonants=0;
	    for (int l = 0; l < s.length(); l++) {
	        for (int r = l+k-1; r < s.length(); r++) {
	            for (int idx = l; idx <= r; idx++) {
	                if (isVowel(s.toCharArray()[idx]) == true) { //isVowel() is a function that returns true for a vowel and false otherwise.
	                    countVowels++;
	                }
	                else {
	                    countConsonants++;
	                }
	            }
	            res += String.valueOf(countVowels*countConsonants);
	        }
	    }
		System.out.println(res.toString());
	}
	
	static boolean isVowel(char ch) {
		
		if(ch=='a' || ch=='e'
				|| ch=='i' || ch=='o'
				|| ch=='u') {
			return true;
		} else {
			return false;
		}
		
		
	}

}
