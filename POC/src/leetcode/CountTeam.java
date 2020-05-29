/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Apr 4, 2020
 */
public class CountTeam {

	/*	1395. Count Number of Teams
	There are n soldiers standing in a line. Each soldier is assigned a unique rating value.

	You have to form a team of 3 soldiers amongst them under the following rules:

	Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
	A team is valid if:  (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k]) where (0 <= i < j < k < n).
	 */	public static void main(String[] args) {

		 int[] arr = {2,5,3,4,1};
		 int res = 0;
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]==arr[j])
					 break;
				 for(int k=j+1;k<arr.length;k++) {
					 if(arr[i]>arr[j] && arr[j]>arr[k]) {
						 res++;
					 }
					 if(arr[i]<arr[j] && arr[j]<arr[k]) {
						 res++;
					 }
				 }
			 }
		 }
		 System.out.println(res);
	 }

}
