/**
 * 
 */
package hackerrank;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date May 17, 2019
 */
public class FindGemsStones {

	public static void main(String[] args) {

		String[] str = {"abcdde","bacc","eeabg"};
		int[] arr = new int[26];
		for(int i=0;i<str.length;i++) {
			Map<Character, Integer> map = new HashMap<>();
			char[] chr = str[i].toCharArray();
			int j=0;
			while(j<chr.length) {
				if(map.get(chr[j]) !=null) {
					map.put(chr[j], map.get(chr[j])+1);
				} else {
					map.put(chr[j],1);
					arr[chr[j]-'a']++;
				}
				j++;
			}
		}
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == str.length)
				count++;
		}
		System.out.println(count);

	}

}
