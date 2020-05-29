/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 18, 2020
 */
public class RtatdCountCrclrSortedArry {

	
	public static void main(String[] args) {
		int[] arr = {8,9,10,2,5,6};
		
		//find pivot element, minimum element, this is O(n) SOL
		
		int min = Integer.MAX_VALUE;
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
				index=i;
			}
		}
		System.out.println(index+" rotation");
		
		// find pivot in O(logn) using binary search
		//then find rotated count
		System.out.println(searchBinary(arr,0,arr.length-1));
		

	}
	
	static int searchBinary(int[] arr, int low, int high) {
		if(high<low)
			return 0;
		if(high==low)
			return low;
		int mid = low+(high-low)/2;
		if(mid>low && arr[mid]<arr[mid-1])
			return mid;
		if(mid<high && arr[mid+1]<arr[mid])
			return mid+1;
		if(arr[high]>arr[mid]) {
			return searchBinary(arr, low, mid-1);
		}
		else 
			return searchBinary(arr, low, mid-1);
	}

}
