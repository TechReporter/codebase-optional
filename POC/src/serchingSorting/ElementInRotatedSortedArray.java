/**
 * 
 */
package serchingSorting;

/**
 * @author 212720190
 * @date Jun 8, 2019
 */
public class ElementInRotatedSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3}; 
		int n = arr.length; 
		int key = 6; 
		System.out.println(getElement(arr,0,n,key));
	}

	static int getElement(int[] arr, int low, int high, int k) {
		if(low>high) {
			return -1;
		}
		int midElem = low+(high-low)/2;

		if(arr[midElem]==k)
			return midElem;

		if(arr[midElem]>=arr[low]) {

			if(k>=arr[low] && k<=arr[midElem]) {
				return getElement(arr, low, midElem-1, k);
			} else {
				return getElement(arr, midElem+1, high, k);
			}
		} 

		if(k>=arr[midElem] && k<=arr[high]) {
			return getElement(arr, midElem+1, high, k);
		} else {
			return getElement(arr, low, midElem-1, k);

		}
	}
}
