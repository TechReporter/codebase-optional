/**
 * 
 */
package datastructure;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 212720190
 * @date Jul 10, 2019
 */
public class NonDivisibleSubSetCount {


	public static void main(String[] args) {

		int[] arr = {1,7,2,4};
		int k=3;
		Set<Integer> set = new HashSet<>();
		int[] arr1 = new int[k];
		for(int i=0;i<arr.length;i++) {
			arr1[arr[i]%k]++;
		}
		if (k % 2 == 0) 
            arr1[k/2] = Math.min(arr1[k/2], 1);
		
		 int res = Math.min(arr1[0], 1); 
	      
	        // Choose maximum of count of numbers 
	        // giving remainder i or K-i 
	        for (int i = 1; i <= k/2; i++) 
	            res += Math.max(arr1[i], arr1[k-i]); 
	        
	/*	for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]+arr[j])%k==0) {
					set.add(arr[i]);
					set.add(arr[j]);

				}
			}
		}*/
		
		System.out.println(res);
	}

}
