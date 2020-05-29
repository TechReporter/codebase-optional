/**
 * 
 */
package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Apr 29, 2019
 */
public class AlternaterMaxMinArray {

	public static void main(String[] args) {

		int[] array = {5,3,8,6,1,9,21,17,12};
		Arrays.sort(array);
		int[] array1 = new int[array.length-1];
		int k =0;
		for(int i = 0; i<array.length/2;i++) {
			array1[k++] = array[i];
			array1[k++] = array[array.length-i-1];
		}
		System.out.println(Arrays.toString(array1));
	}

}
