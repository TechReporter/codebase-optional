package serchingSorting;

/**
 * @author 212720190
 * @date Aug 10, 2019
 */
public class FrequencyInSortedArray {

	public static void main(String[] args) {

		int arr[] = {1, 2, 2, 2, 2,  
				3, 4, 7, 8, 8}; 
		int x = 8; 
		System.out.println(getBinarySearch(arr,0,arr.length-1,x));
        System.out.println(count(arr, x, arr.length)); 

	}

	static int getBinarySearch(int[] arr, int low, int high, int val) {
		int index =0;
		int count=1;

		if(low>high)
			index=-1;

		int mid = (high-low)/2+low;

		if(arr[mid]==val)
			index=mid;

		else if(arr[mid]>val) {
			getBinarySearch(arr, low, mid-1, val);
		}
		else {
			getBinarySearch(arr, mid+1, high, val);
		}

		if(index==-1) {
			System.out.println("not present");
			System.exit(0);
		}
		else {
			int left=index-1;
			int right=index+1;
			while(left>0 && arr[left]==val) {
				count++;
				left--;
			}
			while(right<arr.length && arr[right]==val) {
				count++;
				right++;
			}
		}

		return count;
	}
	
	//freq of a number in sorted array in O(logn) time.
	//approach is use modified binary search
	static int count(int arr[], int x, int n) 
    { 
      int i;  
      int j;  
           
      i = first(arr, 0, n-1, x, n); 
       
      if(i == -1) 
        return i; 
  
      j = last(arr, i, n-1, x, n);      
          
      return j-i+1; 
    } 
       
	
    static int first(int arr[], int low, int high, int x, int n) 
    { 
      if(high >= low) 
      { 
        int mid = low + (high - low)/2;   
        if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x) 
          return mid; 
        else if(x > arr[mid]) 
          return first(arr, (mid + 1), high, x, n); 
        else
          return first(arr, low, (mid -1), x, n); 
      } 
      return -1; 
    } 
      
    
    static int last(int arr[], int low, int high, int x, int n) 
    { 
      if(high >= low) 
      { 
        int mid = low + (high - low)/2;
        if( ( mid == n-1 || x < arr[mid+1]) && arr[mid] == x ) 
          return mid; 
        else if(x < arr[mid]) 
          return last(arr, low, (mid -1), x, n); 
        else
          return last(arr, (mid + 1), high, x, n);       
      } 
      return -1; 
    } 

}
