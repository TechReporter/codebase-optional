/**
 * 
 */
package hackerrank;

import java.util.Arrays;

/**
 * @author 212720190
 * @date May 17, 2019
 */
public class lexicographicalStringCompare {

	public static void main(String[] args) {

		String str = "welcometojava";
		String[] arr = new String[str.length()-2];
		int n =3;
		int k=0;	
		int i=0;
		while(k<str.length()-2) {
			arr[i] = str.substring(k, Math.min(k+n, str.length()));
			k++;
			i++;
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
