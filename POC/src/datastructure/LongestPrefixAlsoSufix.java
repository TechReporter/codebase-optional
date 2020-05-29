/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Jun 8, 2019
 */
public class LongestPrefixAlsoSufix {

	public static void main(String[] args) {

		String str = "aacbdetaacb";
		
		int mid = str.length()/2;
		int s = 0;
		while(mid<str.length()) {
			if(str.charAt(mid)==str.charAt(s)) {
				++s;
				++mid;
			} else {
				if(s==0)
					++mid;
				else
					--s;
			}
		}
		System.out.println(s);
	}

}
