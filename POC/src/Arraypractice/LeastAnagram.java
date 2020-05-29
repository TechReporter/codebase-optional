/**
 * 
 */
package Arraypractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Mar 27, 2020
 */
public class LeastAnagram {

	public static void main(String[] args) {
		String[] str = {"frame","code","doce","ecod","framer"};
		Map<String, String> map = new HashMap<>();
		for(String s : str) {
			char[] chr = s.toCharArray();
			Arrays.sort(chr);
			String ss = String.valueOf(chr);
			if(!map.containsKey(ss)) {
				map.put(ss, s);
			}
		}
		map.values().stream().sorted()
		.forEach(System.out::println);
	}

}
