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
public class FindAllSubsetArray {

	//find all subset, this is called power set too. using 2^n complexity
	//using recursion
	public static void main(String[] args) {
		int[] arr= {1,2,3,3};
		List<List<Integer>> result = new ArrayList<>();
		subset(arr, result, 0, new ArrayList<>());
		result.forEach(System.out::print);
	}
	static void subset(int[] arr,List<List<Integer>> result,int index, List<Integer> current) {
		result.add(new ArrayList<>(current));
		for(int i=index;i<arr.length;i++) {
			current.add(arr[i]);
			subset(arr, result, i+1, current);
			current.remove(current.size()-1);
		}
	}
}
