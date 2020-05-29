/**
 * 
 */
package hackerrank;

import java.util.Arrays;

/**
 * @author 212720190
 * @date May 13, 2019
 */
public class FunnyString {

	public static void main(String[] args) {

		String str = "acxz";
		int[] gap_forward = new int[str.length()-1];
		int[] gap_reverse = new int[str.length()-1];
		
		for(int i=0;i<str.length()-1;i++) {
			
			gap_forward[i] =  Math.abs((int)str.charAt(i) - (int)str.charAt(i+1)) ;
			gap_reverse[i] = Math.abs((int)str.charAt(str.length()-1-i)-
					(int)str.charAt(str.length()-1-i-1));
		}
		
		if(Arrays.equals(gap_forward, gap_reverse)) {
			System.out.println("funny");
		} else {
			System.out.println("not funny");
		}
		
		
		
		
	}

}
