/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 24, 2020
 */
public class MinCostToArrayEqual {

	/*Given an array arr[] consisting of N positive integers, 
	 * the task is to make all values of this array equal to some 
	 * integer value with minimum cost after performing below operations 
	 * any number of times (possibly zero).

	Reduce the array element by 2 or increase it by 2 with zero cost.
	Reduce the array element by 1 or increase it by 1 with a unit cost.*/
	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 1, 5};
		
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println(Math.min(even, odd));
		

	}

}
