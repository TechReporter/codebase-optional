/**
 * 
 */
package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date May 19, 2019
 */
public class FindAllPair {

	//find all pair if (x<y)
	public static void main(String[] args) {

		int[] arr = {2,4,5,1,3,8,7};
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println("{"+arr[i]+","+arr[j]+"}");
			}
		}
	}

}
