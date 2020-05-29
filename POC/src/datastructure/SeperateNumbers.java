package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Nov 10, 2019
 */
public class SeperateNumbers {
// seperate 0s 1s 2s
	public static void main(String[] args) {
		int[] arr = {2, 0, 1, 2, 1, 1};
		int low=0,mid=0,high=arr.length-1;
		while(mid<high) {
			if(arr[mid]==0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			}
			if(arr[mid]==1)
				mid++;
			if(arr[mid]==2) {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
