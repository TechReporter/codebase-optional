/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 7, 2020
 */
public class LongestIncreasingSubArray {

	//maximum increasing possible subarray
	//this casn be solved in O(N) time
	public static void main(String[] args) {

		int[] arr = {0,97,2,3,6,9,1,3};

			int maxLen = Integer.MIN_VALUE;
			int currLen = 1;
			int Startindex=0;
			int endIndex=0;
			int tempIndex=0;
			for(int i=1;i<arr.length-1;i++) {
				if(arr[i]>arr[i-1]) {
					currLen++;
					endIndex=i;
				} else {
					currLen=1;
					tempIndex=i;
				}
				if(maxLen<currLen) {
				maxLen=currLen;
				endIndex=i;
				Startindex=i-tempIndex-1;
				}
			}
			System.out.println(maxLen);
			for(int j=Startindex;j<=endIndex;j++) {
				System.out.print(arr[j]+" ");
			}
	}

}
