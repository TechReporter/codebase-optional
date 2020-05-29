/**
 * 
 */
package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 212720190
 * @date Apr 5, 2020
 */
public class MostCommonWord {

	//819. Most Common Word
	public static void main(String[] args) {
		String[] banned = {"hit"};
		List<String> ll = Arrays.asList(banned);
		int max = Integer.MIN_VALUE;
		String res="";
		String paragraph = "a, a, a, a, b,b,b,c, c";
		String[] list = paragraph.toLowerCase().split("[ !?',;.]+");;
		Map<String, Integer> map = new HashMap<>();
		for(int i=0;i<list.length;i++) {
			if(!ll.contains(list[i]))
			map.put(list[i], map.getOrDefault(list[i], 0)+1);
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue()>max) {
				max=entry.getValue();
				res=entry.getKey();
			}	
		}
		System.out.println(res);
	}

}
