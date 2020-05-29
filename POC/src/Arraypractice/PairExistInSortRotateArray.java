package Arraypractice;

/**
 * @author 212720190
 * @date Jan 30, 2020
 */
public class PairExistInSortRotateArray {

	
	public static void main(String[] args) {

		int[] arr = {4,5,8,1,3};
		int sum=5;
		//find pivot elem
		int pivot =0;
		for(pivot=0;pivot<arr.length-1;pivot++) {
			if(arr[pivot]>arr[pivot+1])
				break;
		}
		int low = (pivot+1)%arr.length;
		int high = pivot;
		
		while(low!=high) {
			
			if(arr[low]+arr[high]==sum) {
				System.out.println(low+" "+high);
				break;
			} else if(arr[low]+arr[high]<sum) {
				low = (low+1)%arr.length; //move low to higher value
			} else {
				high= (arr.length+high-1)%arr.length; // move high to lower value
			}
				
		}
	}

}
