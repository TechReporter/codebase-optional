/**
 * 
 */
package Arraypractice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Feb 23, 2020
 */
public class FirstDuplicateSmallIndex {

	//get first duplicate with smaller index.
	// if more than one duplicate, return whose next occurrence has smaller index
	public static void main(String[] args) {

		int[] arr = {2,3,4,5};
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i])==null) {
				map.put(arr[i], 1);
			} else {
				System.out.println(arr[i]);
				break;
			}
		}
		System.out.println(-1);

		// another way
		System.out.println(testDuplicate(arr));
	}

	private static int testDuplicate(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[Math.abs(arr[i])-1]<0) {
				return Math.abs(arr[i]);
			}
			else {
				arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
			}
		}
		return -1;
	}

}
