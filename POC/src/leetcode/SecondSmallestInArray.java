package leetcode;

/**
 * @author 212720190
 * @date Nov 10, 2019
 */
public class SecondSmallestInArray {

	public static void main(String[] args) {

		int[] arr = {10,20,6,9,13};
		int smallest = arr[0];
		int second_smallest = arr[1];
		for(int i=2;i<arr.length;i++) {
			if(arr[i]<smallest) {
				second_smallest=smallest;
				smallest=arr[i];
			} else if(arr[i]<second_smallest) {
				second_smallest=arr[i];
			}
		}
		System.out.println(second_smallest);
	}

}
