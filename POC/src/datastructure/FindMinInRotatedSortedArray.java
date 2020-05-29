/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Dec 6, 2019
 */
public class FindMinInRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = {2,4,5,7,9};
		System.out.println(search(test(arr,14),0,arr.length-1));
	}

	static int[] test(int[] arr, int k) {
		int[] arr1 = new int[arr.length];
		int rotate = k%arr.length;

		for(int i=0;i<arr.length;i++) {
			arr1[i] = arr[(i+rotate)%arr.length];
		}
		return arr1;
	}

	static int search(int[] arr, int low, int high) {

		while(low<=high) {
			if(arr[low]<=arr[high]) {
				return arr[low];
			}
			int mid = low+(high-low)/2;
			if(arr[mid]<arr[low]) {
				high=mid;
			} else {
				low=mid+1;
			}
		}
		return 0;
	}


}
