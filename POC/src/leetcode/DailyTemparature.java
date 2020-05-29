/**
 * 
 */
package leetcode;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Mar 21, 2020
 */
public class DailyTemparature {

	//739. Daily Temperatures
	public static void main(String[] args) {
		int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
		int[] res = new int[arr.length];
		for(int i=0;i<arr.length-1;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					res[i]=count;
					break;
				} else {
					count++;
				}
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
