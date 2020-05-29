/**
 * 
 */
package Arraypractice;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Mar 19, 2020
 */
public class RplceLstGreaterRightElment {
//Replace every element of an array with the least greater element on its right
	//O(n^2)
	public static void main(String[] args) {
		int[] arr = {10,100,93,32,35,65,80,90,94,6};
		int[] result = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int min = Integer.MAX_VALUE;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					min=Math.min(min, arr[j]);
				}
			}
			if(min!=Integer.MAX_VALUE) {
				result[i]=min;
			} else {
				result[i]=-1;
			}
		}
		
		Arrays.stream(result).forEach(e->System.out.printf(e+" "));

	}

}
