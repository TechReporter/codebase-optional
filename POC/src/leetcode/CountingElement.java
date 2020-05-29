/**
 * 
 */
package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 212720190
 * @date Apr 7, 2020
 */
public class CountingElement {

	//Given an integer array arr, count element x such that x + 1 is also in arr.
	//If there're duplicates in arr, count them seperately.
	public static void main(String[] args) {
		int[] arr = {1,1,2,2};
		int count=0;
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++)
			set.add(arr[i]);

		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i]+1))
				count++;
		}
		System.out.println(count);
	}

}
