/**
 * 
 */
package serchingSorting;

/**
 * @author 212720190
 * @date Apr 9, 2019
 */
public class BinarySearchRecursive {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 40, 10, 40 }; 
        int n = arr.length; 
        int x = 22;
        int result = searchBinary(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 		
	

	private static int searchBinary(int arr[], int low, int high, int value) {
		
		if(high>=low) {
			int mid = low+ (high-low)/2;
			
			if(arr[mid]==value)
				return mid;
			
			if(arr[mid]>value) {
				return searchBinary(arr, low, mid-1, value);
			} else {
				return searchBinary(arr, mid+1, high, value);
			}
		}
		
		return -1;
	}
}
