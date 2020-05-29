package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Jul 29, 2019
 */
public class MergeTwoSortedArray {


	public static void main(String[] args) {

		int[] arr1 = {3,6,7,8};
		int[] arr2 = {2,7,9};
		int[] arr3 = new int[arr1.length+arr2.length];

		int i=0,j=0,k=0;

		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]>=arr2[j]) {
				arr3[k++]=arr2[j];
				j++;
			}
			else if(arr1[i]<arr2[j]) {
				arr3[k++]=arr1[i];
				i++;
			}
		}

		while(i<arr1.length) {
			arr3[k++]=arr1[i];
			i++;
		}

		while(j<arr2.length) {
			arr3[k++]=arr2[j];
			j++;
		}

		System.out.println(Arrays.toString(arr3));
	}

}
