/**
 * 
 */
package dynamicProg;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Feb 3, 2020
 */
public class LongstIncrBitonicSubSqnc {
//longest increasing bitonic subsequence is increasing from left to right+right to left
	public static void main(String[] args) {
		int[] arr = {2,-1,4,3,5,-1,3,2};
		
		int[] dpleft = new int[arr.length];
		int[] dpright = new int[arr.length];

		Arrays.fill(dpleft, 1);
		Arrays.fill(dpright, 1);

		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					dpleft[i] = Math.max(dpleft[j]+1, dpleft[i]);
				}
			}
		}
		
		for(int i=arr.length-2;i>=0;i--) {
			for(int j=arr.length-1;j>i;j--) {
				if(arr[j]<arr[i]) {
					dpright[i] = Math.max(dpright[j]+1, dpright[i]);
				}
			}
		}
		
		int max = 0;
        for(int i=0; i < arr.length; i++){
            if(max < dpleft[i] + dpright[i]-1){
                max = dpleft[i] + dpright[i] -1;
            }
        }
        System.out.println(max);
	}

}
