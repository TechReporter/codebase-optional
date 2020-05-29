package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Nov 12, 2019
 */
public class MaximumProductTriplet {

	//handle negetive cases
	public static void main(String[] args) {

		int[] arr = {3,-6,1,6,5,-9};
		Arrays.sort(arr);

		int tripletMax1 = arr[0]*arr[1]*arr[arr.length-1];
		int tripletMax2 = arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3];

		if(tripletMax1>tripletMax2)
			System.out.println("max product :: "+tripletMax1);
		else 
			System.out.println("max product :: "+tripletMax2);

		// another approach
		//find highest 3 number and min 2 number wihout sorting

		int max1 = 0,max2=-1,max3=-1;
		int min1=0,min2=-1;

		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]>arr[max1]) {
				max3=max2;
				max2=max1;
				max1=i;
			}
			else if(max2==-1 || arr[i]>arr[max2]) {
				max3=max2;
				max2=i;
			} else if(max3==-1 || arr[i]>arr[max3]) {
				max3=i;
			}
		}
		for(int j=1;j<=arr.length-1;j++) {
			if(arr[j]<arr[min1]) {
				min2=min1;
				min1=j;
			} else if(min2==-1 || arr[j]<arr[min2]) {
				min2=j;
			}
		}
		if(arr[max1]*arr[max2]*arr[max3]> arr[max1]*arr[min1]*arr[min2])
			System.out.println(arr[max1]*arr[max2]*arr[max3]);
		else
			System.out.println(arr[max1]*arr[min1]*arr[min2]);

	}
}
