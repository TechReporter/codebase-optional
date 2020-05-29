/**
 * 
 */
package Arraypractice;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Mar 4, 2020
 */
public class MaxMinArray {

	//arrange array in max min order
	public static void main(String[] args) {
		int[] arr = {2,6,3,1,5,9,8,4};
		
		//rearrange it in higest max higest min, secnd higst max scnd higest min order
		Arrays.sort(arr);
		int[] min = new int[arr.length/2];
		int[] max = new int[arr.length/2];
		int j=arr.length-1;
		for(int i=0;i<arr.length/2;i++) {
			min[i]=arr[i];
			max[i]=arr[j--];
		}
		int[] res = new int[arr.length];
		int k=0;
		int i=0;
		while(k<arr.length) {
			res[k++]=max[i];
			res[k++]=min[i];
			i++;
		}

	}

}
