/**
 * 
 */
package hackerrank;

/**
 * @author 212720190
 * @date May 15, 2019
 */
public class DesignPdfViewer {

	public static void main(String[] args) {

		int[] arr = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,5, 5, 5,5,7};
		String word = "zabc";
		int max = Integer.MIN_VALUE;
		for(int i =0; i<word.length();i++) {
			if(arr[word.charAt(i)-'a'] > max)
				max = arr[word.charAt(i)-'a'];
		}
		System.out.println(max*word.length());
	}

}
