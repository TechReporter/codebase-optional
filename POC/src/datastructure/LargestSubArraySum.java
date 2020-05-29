/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Dec 6, 2019
 */
public class LargestSubArraySum {
	
	public static void main(String[] args) {

		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		int arr1[] = {1, 4, 2, 10, 2, 3, 1, 0, 20 };

		largestSum(arr);
		larestSumOfK(arr1, 4);
	}

	private static void largestSum(int[] arr) {
		int current_max= 0;
		int max= 0;
		
		for(int i=0;i<arr.length;i++) {
			current_max = Math.max(current_max, current_max+arr[i]);
					if(max<current_max) {
						max=current_max;
					}
	
		}
		System.out.println(max);
	}
	
	private static void larestSumOfK(int[] arr, int k) {
		int intitial_window =0;
		for(int i=0;i<k;i++) {
			intitial_window+=arr[i];
		}
		int j=k;
		int m=0;
		int max = 0;
		while(j<arr.length) {
			intitial_window-=arr[m];
			intitial_window+=arr[j];
			max = Math.max(max, intitial_window);
			m++;
			j++;
		}
		System.out.println(max);
	}

}
