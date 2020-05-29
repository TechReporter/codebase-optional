/**
 * 
 */
package Arraypractice;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 212720190
 * @date Mar 5, 2020
 */
public class DuplicateWithinRange {

	//check if any element duplicating within range k in array
	public static void main(String[] args) {

		int[] arr = {5,3,5,7,1,8,3,2};
		int k=3;
		//logic is to create window of k and process all window element in set. and proceed
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<k;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			} else {
				System.out.println("duplicate: "+arr[i]);
				break;
			}
		}
		for(int i=k;i<arr.length;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
				set.remove(arr[i-k]);
			}
			else {
				System.out.println("duplicate: "+arr[i]);
				break;
			}

		}
	}

}
