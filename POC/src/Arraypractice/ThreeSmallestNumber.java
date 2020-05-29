/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Jan 22, 2020
 */
public class ThreeSmallestNumber {

	public static void main(String[] args) {

		int[] arr = {4,8,2,19,9};
		int smallest = Integer.MAX_VALUE;
		int second_smallest = Integer.MAX_VALUE;
		int trd_smallest = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				trd_smallest = second_smallest;
				second_smallest=smallest;
				smallest=arr[i];
			} else if(arr[i]<second_smallest) {
				trd_smallest = second_smallest;
				second_smallest=arr[i];
			} else if(arr[i]<trd_smallest) {
				trd_smallest=arr[i];
			}
		}
		System.out.println("smallest "+smallest+" second smallest "+second_smallest+
				" thrd smallest "+trd_smallest);
	}

}