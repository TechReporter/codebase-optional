/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author 212720190
 * @date Apr 11, 2020
 */
public class TopKfrequentElement {

	
	public static void main(String[] args) {
		int[] nums = {1};
		//Arrays.sort(nums);
		int k=1;
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++)
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		
		Map<Integer, Integer> sortMap = map
		        .entrySet()
		        .stream()
		        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		        .collect(
		            Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
		                LinkedHashMap::new));
	
		list = new ArrayList<Integer>(sortMap.keySet()).stream().limit(k)
				.collect(Collectors.toList());
	}
	
	
}
