/**
 * 
 */
package datastructure;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * @author 212720190
 * @date Dec 29, 2019
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] S = {"tanmoy", "mani","tanmoy","sanjoy","tanmoy"};
	    Map<String, Integer> map = new TreeMap<>();
        for(int i=0;i<5;i++) {
            if(map.containsKey(S[i])) {
                map.put(S[i],map.get(S[i])+1);
            } else {
                    map.put(S[i],1);
            }
        }
        
        List<String> sortMap = map.entrySet().stream()
                                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->
                                        e2, LinkedHashMap::new)).keySet()
                                        .stream().collect(Collectors.toList());
        
        // write your code here
        System.out.println(sortMap);
	}

}
