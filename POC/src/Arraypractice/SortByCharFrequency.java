package Arraypractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * @author 212720190
 * @date Mar 5, 2020
 */
public class SortByCharFrequency {

//sort character by their freq in word 
	public static void main(String[] args) {
		aproach1();
		approach2();
	}

	/**
	 * 
	 */
	private static void aproach1() {
		String str = "tree";
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
		}
		Map<Character, Integer> sortedByCount = map.entrySet()
                .stream()
                .sorted((Map.Entry.<Character, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                		(e1, e2) -> e1, LinkedHashMap::new));
		List<Character> list = new ArrayList<>(sortedByCount.keySet());
			StringBuilder strB = new StringBuilder();
			int i=0;
			while(!sortedByCount.isEmpty()) {
				int count = sortedByCount.get(list.get(i));
				for(int j=0;j<count;j++) {
					strB.append(list.get(i));
				}
				sortedByCount.remove(list.get(i));
				i++;
			}

			System.out.println(strB.toString());
	}
	//using maxheap
	static void approach2() {

		String str = "tree";
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
		}
		
		PriorityQueue<Character> q = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
		q.addAll(map.keySet());
		StringBuilder strB = new StringBuilder();

		while(!q.isEmpty()) {
			Character c = q.poll();
			int count=map.get(c);
			for(int i=0;i<count;i++) {
				strB.append(c);
			}
		}
			System.out.println(strB.toString());
	}

}
