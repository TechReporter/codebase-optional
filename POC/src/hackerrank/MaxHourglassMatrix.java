/**
 * 
 */
package hackerrank;

/**
 * @author 212720190
 * @date Mar 8, 2020
 */
public class MaxHourglassMatrix {


	public static void main(String[] args) {
		int[][] arr = {{1,1,1,0,0,0},
			{0,1,0,0,0,0},
			{1,1,1,0,0,0},
			{0,0,2,4,4,0},
			{0,0,0,2,0,0},
			{0,0,1,2,4,0}};

		int max=Integer.MIN_VALUE;
		int currSum =0;
		for(int i=0;i<arr.length-2;i++) {
			for(int j=0;j<arr.length-2;j++) {
				currSum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
						arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				max=Math.max(max, currSum);
			}
		}
		System.out.println(max);
	}

}
