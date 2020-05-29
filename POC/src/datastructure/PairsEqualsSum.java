/**
 * 
 */
package datastructure;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 212720190
 * @date Apr 12, 2019
 */
public class PairsEqualsSum {

	public static void main(String[] args) {

		int sum = 52;
		int[] arr = {4,6,12,16,25,27,33,35,39,42};
		int[] arr1 = {3,5,7,4,12,11,8,19,20,15,13};
		int sum1 = 50;

		pairSumWithSortArray(arr, sum);
		pairSumWithUnsortArray(arr1,sum1);

	}
	
	private static void pairSumWithSortArray(int[] arr, int sum) {
		
		int pivotIndexIntitial = 0;
		int pivotIndexFinal = arr.length-1;
		for(int i = 0; i<arr.length; i++) {
			if(arr[pivotIndexIntitial]+arr[pivotIndexFinal]==sum) {
				System.out.println("start index :: "+pivotIndexIntitial+" end index :: "+pivotIndexFinal);
				break;
			} else if(arr[pivotIndexIntitial]+arr[pivotIndexFinal]>sum) {
				pivotIndexFinal--;
			} else if(arr[pivotIndexIntitial]+arr[pivotIndexFinal]<sum) {
			pivotIndexIntitial++;	
			} else {
				System.out.println("not found");
			}
		}
	}
	
	private static void pairSumWithUnsortArray(int[] arr, int sum) {
		boolean flag = false;
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i<arr.length; i++) {
			if(!set.contains(arr[i])) {
				flag = true;
				set.add(sum-arr[i]);
			}
		}
		System.out.println(flag);
	}


}
