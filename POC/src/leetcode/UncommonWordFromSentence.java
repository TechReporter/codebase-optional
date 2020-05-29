package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 212720190
 * @date Apr 11, 2020
 */
public class UncommonWordFromSentence {

	public static void main(String[] args) {
		String A = "";
		if(A.isEmpty())
			Arrays.asList("");
		String B = "this is sour apple";
		String[] str1 = A.split(" ");
		String[] str2 = B.split(" ");
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		List<String> list = new ArrayList<>();
		for(int i=0;i<str1.length;i++)
			map1.put(str1[i], map1.getOrDefault(str1[i], 0)+1);

		for(int i=0;i<str2.length;i++)
			map2.put(str2[i], map2.getOrDefault(str2[i], 0)+1);

		for(int i=0;i<str1.length;i++) {
			if(map2.get(str1[i])==null && map1.get(str1[i])==1)
				list.add(str1[i]);
		}

		for(int i=0;i<str2.length;i++) {
			if(map1.get(str2[i])==null && map2.get(str2[i])==1)
				list.add(str2[i]);
		}
		String[] res = new String[list.size()];
		list.toArray(res);
	}

}
