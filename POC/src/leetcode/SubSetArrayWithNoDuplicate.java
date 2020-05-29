package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 212720190
 * @date Mar 9, 2020
 */
public class SubSetArrayWithNoDuplicate {


	public static void main(String[] args) {

		int[] arr= {1,2,3,3};
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(arr);
		subset(arr, result, 0, new ArrayList<>());
		result.forEach(System.out::print);
	}
	
	static void subset(int[] arr,List<List<Integer>> result,int index, List<Integer> current) {
		result.add(new ArrayList<>(current));
		for(int i=index;i<arr.length;i++) {
			if(i>index && arr[i]==arr[i-1])
				continue; // this will not add in list if arr[i] and arr[i-1] are same
			current.add(arr[i]);
			subset(arr, result, i+1, current);
			current.remove(current.size()-1);
		}
	}
}
