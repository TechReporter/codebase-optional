/**
 * 
 */
package Arraypractice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212720190
 * @date Mar 18, 2020
 */
public class SubArrayWithZeroSum {

	//if exist sub array with zero sum
	public static void main(String[] args) {
		int[] arr = {3,4,-7,3,1,3,1,-4,-2,-2};
		
		int left=0;
		int right=0;
		int sum=0;
		List<List<Integer>> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			right++;
			if(sum==0) {
				List<Integer> ll = new ArrayList<>();
				for(int j=left;j<right;j++) {
					ll.add(arr[j]);
				}
				list.add(ll);
				sum-=arr[left++];
			}
		}
		System.out.println();
	}

}
