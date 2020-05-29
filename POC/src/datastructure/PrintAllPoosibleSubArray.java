package datastructure;

/**
 * @author 212720190
 * @date May 19, 2019
 */
public class PrintAllPoosibleSubArray {

	public static void main(String[] args) {

		int[] arr = {2,1,4,3,6,7};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				System.out.print("{");
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.print("}");
			}
		}
	}

}
