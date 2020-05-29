/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 4, 2020
 */
public class FindOddOccurrence {

	//find odd occurrence duplicate
	// using xor, as xor with even count is 0. xor with odd count, itself
	public static void main(String[] args) {
		int[] arr = {4,5,1,2,5,2,4,6,1,2,6};
		
		int xx = 0;
		for(int i=0;i<arr.length;i++) {
			xx=xx^arr[i];
		}
		System.out.println(xx);

	}

}
