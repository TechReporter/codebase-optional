/**
 * 
 */
package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 212720190
 * @date Dec 26, 2019
 */
public class AnagramGroups {


	public static void main(String[] args) {
		String[] str = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> listAnagram = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		int count =0;
		for(int i=0;i<str.length;i++) {
			char[] s = str[i].toCharArray();
			Arrays.sort(s);
			String ss = new String(s);
			
			if(map.containsKey(ss)) {
				 listAnagram.get(map.get(ss)).add(str[i]);
			} else {
				listAnagram.add(new ArrayList<>());
				listAnagram.get(count).add(str[i]);
				map.put(ss, count);
				count++;
			}
		}
	}
}
