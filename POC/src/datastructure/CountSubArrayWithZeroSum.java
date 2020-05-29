/**
 * 
 */
package datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Dec 25, 2019
 */
public class CountSubArrayWithZeroSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] A= {2, -2, 3, 0, 4, -7};

		int count=0; 
		int sum=0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0,1);

		for(int i=0;i<A.length;i++) {
			sum+=A[i];
			if (map.containsKey(sum - 0)) {
				count += map.get(sum - 0);
			}
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		System.out.println(count);	
	}

}
