/**
 * 
 */
package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Apr 17, 2019
 */
public class NonAdjacentSubSetArray {

	public static void main(String[] args) {

		int[] arr = {2,4,6,1,3,5,10};
		for(int i =0;i<arr.length;i++) {
			int gap =2;
			int[] arrTemp = new int[arr.length/2+1];
			arrTemp[0] = arr[i];
			for(int j =0;j<arr.length;j++) {
				if(i+gap+j<arr.length) {
					arrTemp[j+1]=arr[i+gap+j];
					gap++;
				}
			}
			System.out.println(Arrays.toString(arrTemp));
		}
	}

}
