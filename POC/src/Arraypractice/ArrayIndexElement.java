/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 4, 2020
 */
public class ArrayIndexElement {

	//determine index before which all element small, after which all element are large
	public static void main(String[] args) {

		int[] arr = {4,2,3,5,1,6,9,7}; 
		
		int[] left = new int[arr.length];
		left[0]=0;
		for(int i=1;i<arr.length;i++) {
			left[i] = Math.max(left[i-1], arr[i-1]);
		}
		int min = arr[arr.length-1];
		for(int j=arr.length-2;j>0;j--) {
			if(left[j]<arr[j] && arr[j]<min) {
				System.out.println(j);
			}
			if(min>arr[j]) {
				min=arr[j];
			}
		}
	}

}
