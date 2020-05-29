package datastructure;

/**
 * @author 212720190
 * @date Jun 10, 2019
 */
public class SecondSmallestInArray {

	public static void main(String[] args) {

		int[] arr = {3,2,5,6};
		int min1 = arr[0];
		int min2 = arr[1];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min1) {
				min2=min1;
				min1=arr[i];
			} else if(arr[i]<min2) {
				min2=arr[i];
			}
		}
		System.out.println("second min "+min2);
	}

}
