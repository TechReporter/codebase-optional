package datastructure;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 212720190
 * @date Dec 9, 2019
 */
public class LongestSubstrWithKDistinct {

	public static void main(String[] args) {

		String str = "abcbdbdbbdcdabd";
		
		int k=3;
		
		int max=0,min=0;
		int low=0,high=0;
		Set<Character> window = new HashSet<>();
		int arr[] = new int[128];
		
		for(;high<str.length();high++) {
			window.add(str.charAt(high));
			arr[str.charAt(high)]++;
			while(window.size()>k) {
				if(--arr[str.charAt(low)]==0) {
					window.remove(str.charAt(low));
				}
				low++;
			}
			if(max-min<high-low) {
				max=high;
				min=low;
			}
		}
		System.out.println(str.substring(min,max+1));
		
	}

}
