/**
 * 
 */
package datastructure;

import java.util.Arrays;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

/**
 * @author 212720190
 * @date Dec 14, 2019
 */
// find distinct pair with given sum k
public class DistinctPairWithGivenSum {

	public static void main(String[] args) {
		int[] arr = {2,6,2,7,3};
		int k = 9;
		usingHashing(arr, k);
		Arrays.sort(arr);
		// this appraoch wont handle if duplicate
		int j= arr.length-1;
		int i=0;
		int count=0;
		
		while(i<j) {
			if(arr[i]+arr[j]==k) {
				
				i++;
				j--;
				count++;
			} else if(arr[i]+arr[j]>k) {
				j--;
			}
			else {
				i++;
			}
		}
		System.out.println(count);
	}
	
	private static void usingHashing(int[] arr, int k) {
		int count =0;
		Map<Integer, Integer> map = new HashedMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			} else {
				map.put(arr[i], 0);
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(k-arr[i])) {
				count++;
			}
			if((k-arr[i])==arr[i]) {
				count--;
			}
		}
		System.out.println(count/2);
	}

}
