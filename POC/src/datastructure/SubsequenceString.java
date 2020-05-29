/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Jul 5, 2019
 */
public class SubsequenceString {

	public static void main(String[] args) {

		String str = "hereiamstackerran";
		String str1 = "hackerrank";
		
		int i=0;int j=0;
		
		while(i<str.length() && j<str1.length()) {
			if(str.charAt(i) == str1.charAt(j)) {
				j++;
			}
			i++;
		}
		if(j==str1.length())
			System.out.println("Yes");
	}

}
