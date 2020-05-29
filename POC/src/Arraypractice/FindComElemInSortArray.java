package Arraypractice;

/**
 * @author 212720190
 * @date Jan 30, 2020
 */

// find common element in 3 sorted array
public class FindComElemInSortArray {

	public static void main(String[] args) {

		int[] arr1 = {3,5,7,8,9};
		int[] arr2 = {2,5,7,9};
		int[] arr3 = {1,4,5,7};
			int p1=0;
			int p2=0;
			int p3=0;
			int commCount = 0;
			while(p1<arr1.length && p2<arr2.length && p3<arr3.length) {
				if(arr1[p1]==arr2[p2] && arr1[p1]==arr3[p3]) {
					commCount++;
					p1++;
					p2++;
					p3++;
				}
				else if(arr1[p1]<arr2[p2]) {
					p1++;
				}
				else if(arr2[p2]<arr3[p3]) {
					p2++;
				} else {
					p3++;
				}
			}
			System.out.println(commCount);
			
	}

}
