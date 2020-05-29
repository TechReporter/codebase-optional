/**
 * 
 */
package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date May 12, 2019
 */
public class PrintLetters {


	public static void main(String[] args) {
		System.out.println(validString());
	}

	static String validString() {

		final String GOOD = "YES";
		final String BAD = "NO";
		String ret ="";
		String str ="aabeff";
		int[] arr = new int[26];
		for(int i = 0;i<str.length();i++) {
			arr[str.charAt(i)-'a']++;
		}
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int count = 0;
		while(arr[count]==0) {
			count++;
		}

		int min = arr[count];
		int max = arr[25];
		ret = BAD;
		if(min==max) {
			return GOOD; 
		}

		if(((max-min==1) && (max>arr[24]))
				|| (min ==1 && 	arr[count+1]==max)) {
			ret = GOOD;

		}
		return ret;
	}
}
