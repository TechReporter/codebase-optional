package datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Dec 9, 2019
 */
// longest possible substring without duplication
public class LongestSubstringDistinctChar {

	public static void main(String[] args) {
		String s = "pwwkew";
		Map<Character, Integer> map = new HashMap<>();
		int left=0;
		int maxLen=0;
		for(int right=0;right<s.length();right++) {
			if(map.containsKey(s.charAt(right))) {
				int index = map.get(s.charAt(right));
				left=Math.max(left, index);
			}
			map.put(s.charAt(right),right+1);
			if(right-left+1>maxLen) {
				maxLen=right-left+1;
			}
		}
		System.out.println(maxLen);
	}

}


