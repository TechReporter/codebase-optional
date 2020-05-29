/**
 * 
 */
package Arraypractice;

import java.util.Arrays;
import java.util.List;

/**
 * @author 212720190
 * @date Mar 19, 2020
 */
public class StringPanagram {


	public static void main(String[] args) {
		List<String> list = Arrays.asList("we promptly judged antique ivory buckles for the next prize",
				"we promptly judged antique ivory buckles for the prizes",
				"the quick brown fox jumps over the lazy dog",
				"the quick brown fox jump over the lazy dog");
		String res = "";
		for(String s:list) {
			String[] str = s.split(" ");
			int[] arr = new int[26];
			for(int i=0;i<str.length;i++) {
				for(int j=0;j<str[i].length();j++) {
					arr[str[i].charAt(j)-'a']++;
				}
			}
			if(test(arr)) {
				res = res.concat("1");
			} else {
				res = res.concat("0");
			}
		}
		System.out.println(res);

	}
	
	static boolean test(int[] arr) {
		for(int m=0;m<arr.length;m++) {
			if(arr[m]==0) {
				return false;
			} 
		}
		return true;
	}

}
