/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 1, 2020
 */
public class MaxSumIncreaseSubSeqnce {


	public static void main(String[] args) {

		int[] arr = {4,6,1,3,8,4,6};

		int[] sum = new int[arr.length];

		for(int i=0;i<arr.length;i++) {
			sum[i]=arr[i];
		}
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					sum[i]=Math.max(sum[i], sum[j]+arr[i]);
				}
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<sum.length;i++) {
			max = Math.max(max, sum[i]);
		}
		System.out.println(max);
	}

}
