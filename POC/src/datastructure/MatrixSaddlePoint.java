/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date May 23, 2019
 */
public class MatrixSaddlePoint {


	public static void main(String[] args) {

		int[][] arr = { {1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};

		for(int i =0;i<arr.length;i++) {
			int max_col = arr[0][i];
			int row_index = 0;

			for(int j=1;j<arr.length;j++) {
				if(max_col<arr[j][i]) {
					max_col = arr[j][i];
					row_index = j;
				}
			}

			int k; 
			for (k = 0; k < arr.length; k++) 
				if (max_col > arr[row_index][k]) 
					break;
			if (k == arr.length) 
			{ 
				System.out.println("Value of Saddle Point " + max_col); 

			}
		}
	}
}
