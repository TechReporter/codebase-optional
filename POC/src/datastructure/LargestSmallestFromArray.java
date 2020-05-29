/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Apr 12, 2019
 */
public class LargestSmallestFromArray {
	public static void main(String[] args) {

		int[] arr = {21,5,6,11,6,99,43,26,76};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("min value =="+min+" max value =="+max);
	}

}
