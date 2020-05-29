/**
 * 
 */
package Arraypractice;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Mar 1, 2020
 */
public class MinCostOfArray {

	//get min cost. [3,5,4,6]-->3+4->[7,5,6]-->7+(7+5)->[18,6]->18+(18+6)->42
	//find min possible cost
	public static void main(String[] args) {

		int[] arr= {3,4,6,5};
		int sum=0;
		int pointer=1;
		int[] arr1 = Arrays.copyOfRange(arr,0, arr.length); 
		Arrays.sort(arr1);
		for(int i=0;i<=arr.length;i++) {
				Arrays.sort(arr);
				int a=arr[0];
				int b= arr[1];
				pointer++;
				int currSum=a+b;
				int k=0;
				int[] copyArr = new int[arr1.length-pointer+1];
				for(int j=pointer;j<arr.length;j++) {
					copyArr[k++]=arr[j];
				}
				copyArr[copyArr.length-1]=currSum;
				arr = Arrays.copyOfRange(copyArr, 0, copyArr.length);
				sum+=currSum;
		}
		System.out.println(sum);
	}

}
