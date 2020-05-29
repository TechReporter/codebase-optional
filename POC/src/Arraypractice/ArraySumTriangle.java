package Arraypractice;

/**
 * @author 212720190
 * @date Jan 30, 2020
 */
public class ArraySumTriangle {
	//sum triangle in bottom-up, where as array grows, it is sum of last two element.
	//4,3,6,2-->7,9,8-->16,17-->33
	public static void main(String[] args) {
		int[] arr = {4,3,6,2};
		int[][] mat = new int[arr.length][arr.length];
		
		for(int i=0;i<arr.length;i++) {
			mat[arr.length-1][i] = arr[i];
		}
		for(int i=arr.length-2;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				mat[i][j] = mat[i+1][j]+mat[i+1][j+1];
			}
		}
		System.out.println(mat[0][0]);
	}

}
