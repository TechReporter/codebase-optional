/**
 * 
 */
package Arraypractice;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Feb 5, 2020
 */
public class WaveFormArray {

	//form array in wave form a[0]>=a[1]<=a[2]>=a[3]
	public static void main(String[] args) {
		//1 can be use sort first, then swap 2 element together, O(nlogn)
		//2 take even index element, swap with previous and next odd index elem, if its smaller
		// vice versa for odd index, if its greater
 
		int[] arr= {2,4,6,3,8,9,1};
		for(int i=1;i<arr.length-1;i+=2) {
			if(arr[i]<arr[i-1]) {
				int temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
			}
			if(arr[i]<arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
