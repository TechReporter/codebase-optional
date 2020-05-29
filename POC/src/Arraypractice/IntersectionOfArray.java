/**
 * 
 */
package Arraypractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 212720190
 * @date Mar 29, 2020
 */
public class IntersectionOfArray {

	//349 intersection of two array
	public static void main(String[] args) {
		int[] arr = {4,9,5};
		int[] arr1 = {9,4,9,8,4};
		
		Set<Integer> result = new HashSet<>();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(!list.contains(arr[i]))
			list.add(arr[i]);
		}
		
		for(int i=0;i<arr1.length;i++) {
			if(list.contains(arr1[i]))
				result.add(arr1[i]);
		}
		int[] res = new int[result.size()];
		int i=0;
		for(Integer ii : result)
			res[i++]=ii;
	}

}
