package datastructure;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 212720190
 * @date May 19, 2019
 */
// unique pair formed with remove all duplicate and then x*x. {1,2,1} = {1,1}{2,2}{1,2}{2,1}
public class UniquePairNumber {

	public static void main(String[] args) {

		int[] arr = {1,4,5,4,6};
		Set<Integer> set_data = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set_data.add(arr[i]);
		}
		System.out.println(Math.pow(set_data.size(), 2));
	}

}
