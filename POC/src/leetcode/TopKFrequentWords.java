package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author 212720190
 * @date Apr 11, 2020
 */
public class TopKFrequentWords {


	public static void main(String[] args) {
		String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
		int k=2;
		 if (words.length == 0 || words == null)
	            new ArrayList<>();
		 
		 Map<String, Integer> map = new HashMap<>();
	        for(String i : words){
	            map.put(i, map.getOrDefault(i, 0) + 1);
	        }
	        Map<String, Integer> sorted = map
			        .entrySet()
			        .stream()
			        .sorted(Map.Entry.comparingByKey())
			        .collect(
			            Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
			                LinkedHashMap::new));
	        
	        List<String>[] freqList = new List[words.length+1];
	        for(String key : sorted.keySet()) {
	        	int freq = sorted.get(key);
	        	if(freqList[freq]==null)
	        		freqList[freq]=new LinkedList<>();
		        freqList[freq].add(key);
	        }
	        
	        List<String> res = new ArrayList<>();
	        for(int i = freqList.length-1; i > 0 && k > 0; i--){
	        	int j=0;
	        	if(freqList[i] != null){
	                List<String> list = freqList[i];
	                while(k>0) {
	                	res.add(list.get(j));
	                	k--;
	                	j++;
	                }
	                k -= list.size();
	            }
	        }
	        Collections.sort(res);
	}

}
