/**
 * 
 */
package hackerrank;

/**
 * @author 212720190
 * @date May 13, 2019
 */
public class StringPangram {


	public static void main(String[] args) {
		String str = "we promptly judged antique ivory buckles for the next prize";
		str = str.replaceAll(" ", "").toLowerCase();
		int[] arr = new int[26];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)-'a']++;
		}
		int i=0;
		while(i<arr.length) {
			if(arr[i]==0) {
			System.out.println("Not pangram");
			break;
			}
			i++;
		}
	}

}
