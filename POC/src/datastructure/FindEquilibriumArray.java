/**
 * 
 */
package datastructure;

import java.util.stream.IntStream;

/**
 * @author 212720190
 * @date May 5, 2019
 */
public class FindEquilibriumArray {

	public static void main(String[] args) {

		int[] array = {0,-3,5,-4,-2,3,1,0};
		
		findEquilibriumMethod2(array);
		findEquilibriumMethod1(array);

	}
	
	static void findEquilibriumMethod2(int[] arr) {
		int[] aux_arr = new int[arr.length];
		aux_arr[0] =0;
		for(int i=1;i<arr.length;i++) {
			aux_arr[i] = aux_arr[i-1]+arr[i-1];
		}
		int right_sum = 0;
		for(int j=arr.length-1; j>=0; j--) {
			if(aux_arr[j]==right_sum) {
				System.out.println("found index=="+j);
			}
			right_sum+=arr[j];
		}		
	}
	
	static void findEquilibriumMethod1(int[] arr) {
		int total_sum = IntStream.of(arr).sum();
		int right_sum1 = 0;
		for(int j=arr.length-1; j>=0; j--) {
			if(right_sum1 == total_sum-(right_sum1+arr[j])) {
				System.out.println("found index=="+j);
			}
			right_sum1+=arr[j];
		}
	}
	

}
