/**
 * 
 */
package Arraypractice;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Feb 5, 2020
 */
public class ElementAppearOnce {

	//find element that appears only once, rest apprears twice
	//it can be found with XOR, XOR of num with iteself is 0, and XOR of num with 0 is itself
	public static void main(String[] args) {

		int[] arr = {2,7,2,4,1,1,7};
		int res = arr[0];
		for(int i=1;i<arr.length;i++) {
			res =res^arr[i];
		}
		System.out.println(res);
		unique(arr);
	}
	// another way
	static void unique(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i+2<arr.length;i+=2) {
			if(arr[i]!=arr[i+1]) {
				System.out.println(arr[i]);
				break;	
			}
		}	
	}

}