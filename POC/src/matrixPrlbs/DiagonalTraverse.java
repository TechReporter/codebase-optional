/**
 * 
 */
package matrixPrlbs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author 212720190
 * @date Jan 4, 2020
 */
public class DiagonalTraverse {

	// print diagonal matrix in zigzag pattern.
	public static void main(String[] args) {
		int[][] arr = {{ 1, 2, 3 },
				{4, 5, 6 },
				{ 7, 8, 9 }};

		List<Integer> list = new ArrayList<Integer>();

		int row = arr.length;
		int col = arr[0].length;
		int[] result = new int[row*col];
		int k=0;

		for(int i=0;i<row+col-1;i++) {
			list.clear();
			int curr_row = i<row?0:i-row+1;
			int curr_col = i<row?i:row-1;

			while(curr_row<col && curr_col>-1) {
				list.add(arr[curr_row][curr_col]);
				curr_row++;
				curr_col--;
			}
			if(i%2==0) {
				Collections.reverse(list);	
			}
			for(int j=0;j<list.size();j++) {
				result[k++]=list.get(j);
			}
		}
		System.out.println(Arrays.toString(result));
	}
}
