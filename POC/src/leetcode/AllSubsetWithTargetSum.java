/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212720190
 * @date Mar 9, 2020
 */
public class AllSubsetWithTargetSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr= {4,1,3,2,5};
		int target= 5;
		List<List<Integer>> result = new ArrayList<>();
		subset(arr, result, 0, new ArrayList<>(),target);
		result.forEach(System.out::print);
	}
	
	static void subset(int[] arr,List<List<Integer>> result,int index, List<Integer> current,int target) {
		if(target==0) {
			result.add(new ArrayList<>(current));
		}
		for(int i=index;i<arr.length;i++) {
			current.add(arr[i]);
			subset(arr, result, i+1, current,target-arr[i]);
			current.remove(current.size()-1);
		}
	}

}
