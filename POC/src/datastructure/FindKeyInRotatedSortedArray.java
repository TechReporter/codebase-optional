/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Dec 22, 2019
 */
public class FindKeyInRotatedSortedArray {

	public static void main(String[] args) {

		int arr1[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; 
		int n = arr1.length; 
		int key = 3; 
		int low = 0;
		System.out.println(pivotedBinarySearch(arr1, low,n, key));


	}

	static int pivotedBinarySearch(int[] arr1, int low, int n, int key) {
		if(low>n) {
			return -1;
		}

		int mid = low+(n-low)/2;
		if(arr1[mid]==key)
			return mid;
		if(arr1[low]<=arr1[mid]) {
			if(key>=arr1[low] && key<=arr1[mid]) {
				return pivotedBinarySearch(arr1, low, mid-1, key);
			} else {
				return pivotedBinarySearch(arr1, mid+1,n, key);
			}
		}
		if(key>=arr1[mid] && key<=arr1[n]) {
			return pivotedBinarySearch(arr1, mid+1, n, key);
		} else {
			return pivotedBinarySearch(arr1, low,mid-1, key);
		}
	}
}
