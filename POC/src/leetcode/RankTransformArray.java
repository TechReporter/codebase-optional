/**
 * 
 */
package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Apr 11, 2020
 */
public class RankTransformArray {

	//1331. Rank Transform of an Array
	public static void main(String[] args) {
		int[] arr = {};
		System.out.println(Arrays.toString(rankArray(arr)));
	}

	private static int[] rankArray(int[] arr) {
		if(arr.length==0)
			return new int[0];
		int[] sortArr = arr.clone();
		Arrays.sort(sortArr);
		Map<Integer, Integer> map = new HashMap<>();
		int rank=1;
		map.put(sortArr[0], 1);
		for(int i=1;i<sortArr.length;i++) {
			if(sortArr[i]!=sortArr[i-1])
			map.put(sortArr[i], ++rank);
		}
		
		int[] res = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i]=map.get(arr[i]);
		}
		return res;
	}

}
