/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date May 17, 2019
 */
public class MinHeapToMaxHeap {
	
	public static void main(String[] args) {
		 int arr[] = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9}; 
	        int n = arr.length; 
	   
	        System.out.print("Min Heap array : "); 
	        printArray(arr, n); 
	   
	        convertMaxHeap(arr, n); 
	   
	        System.out.print("\nMax Heap array : "); 
	        printArray(arr, n); 
	}

	
	static void CreatemaxHeap(int[] arr, int i, int n) {
		int left = 2*i+1;
		int right = 2*i+2;
		
		int largest = i;
		if(left<n && arr[left]>arr[i]) {
			largest = left;
		}
		if(right<n && arr[right]>arr[largest]) {
			largest = right;
		}
		
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			CreatemaxHeap(arr, largest, n);
		}	
	}
	
	  static void convertMaxHeap(int arr[], int n) 
	    {
	        for (int i = (n-2)/2; i >= 0; --i) 
	            CreatemaxHeap(arr, i, n); 
	    }
	  
	  static void printArray(int arr[], int size) 
	    { 
	        for (int i = 0; i < size; ++i) 
	            System.out.print(arr[i]+" "); 
	    } 
}
