/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Feb 27, 2020
 */
public class MaxDifferenceArray {

		// max difference where q>p and a[q]-a[p]=max
			public static void main(String[] args) {
				
				int[] arr = {10,3,6,8,9,4,3};

				int max=Integer.MIN_VALUE;
				int diff=0;
				for(int i=arr.length-1;i>=0;i--) {
					max = Math.max(arr[i], max);
					int temp = max-arr[i];
					diff = Math.max(diff, temp);
				}
				System.out.println(diff);
			}
}
