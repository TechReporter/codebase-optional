/**
 * 
 */
package datastructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 212720190
 * @date Jul 2, 2019
 */
public class KthMissingElementArray {

	public static void main(String[] args) {
		int kth_missing = 5;
		int[] arr = {2, 4, 10, 7};
		int max = Arrays.stream(arr).max().getAsInt();
		int[] miss_arr = new int[max-arr.length];
		int count = 0;
		Set<Integer> data = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			data.add(arr[i]);
		}
		for(int i=1;i<=max;i++) {
			if(!data.contains(i)) {
				miss_arr[count] = i;
				count++;
			}	
		}

		System.out.println(miss_arr[kth_missing]);
	}

}
