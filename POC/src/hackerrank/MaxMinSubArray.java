/**
 * 
 */
package hackerrank;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Mar 28, 2020
 */
public class MaxMinSubArray {

	/*You will be given a list of integers, , and a single integer . 
	 * You must create an array of length  from elements of  such that 
	 * its unfairness is minimized. Call that array . Unfairness of an array is calculated as

	Where:
	- max denotes the largest integer in 
	- min denotes the smallest integer in 

	As an example, consider the array  with a  of . Pick any two elements, test .

	Testing for all pairs, the solution  provides the minimum unfairness.

	Note: Integers in  may not be unique.*/
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,10,20,30,40,100,200};
		Arrays.sort(arr);
		int k=4;
		int i=0;int j=k-1;
		int min = Integer.MAX_VALUE;
		while(j<arr.length) {
			min = Math.min(arr[j]-arr[i],min);
			i++;
			j++;
		}
		System.out.println(min);
		
	}

}
