/**
 * 
 */
package hackerrank;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Mar 8, 2020
 */
public class SavePrisoner {


	public static void main(String[] args) {
		int[] arr={3,3,2,1,3};
		Arrays.sort(arr);
		int count=0;
		int max=-99999;
		for(int i=1;i<arr.length;i++){
			if(arr[i]==arr[i-1])
				count++;
			else{
				count=0;
			}
			max=Math.max(max,count);
		}
		System.out.println(arr.length-max-1);

			/*

		int n =999999999;
		int m=999999998;int s=999983945;
		if(Long.valueOf(m)>Long.valueOf(n)) {
			System.out.println((s-1)+Long.valueOf(m)%Long.valueOf(n));
		}
		else {
			System.out.println((s-1)+Long.valueOf(m));
		}

			 */}

	}
