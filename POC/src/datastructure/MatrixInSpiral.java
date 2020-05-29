
package datastructure;

/**
 * @author 212720190
 * @date May 23, 2019
 */
public class MatrixInSpiral {
//not completed, need to check

	public static void main(String[] args) {
		int[][] mat	= { {1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};
		
		int row_start =0,row_end=mat.length,col_start=0,col_end=mat.length;
		
		while(row_start<row_end && col_start<col_end) {
			
			for(int i=col_start;i<mat.length;++i) {
				System.out.println(mat[row_start][i]+" ");
			}
			row_start++;
			for(int i=row_start;i<mat.length;i++) {
				System.out.println(mat[i][col_end-1]);
			}
			col_end--;
			if(row_start<row_end-1) {
			for(int i=col_end;i>col_start;i--) {
				System.out.println(mat[row_end-1][i-1]);
			}
			row_end--;
		}
			if(col_start<col_end-1) {
				for(int i=row_end;i>row_start;i--) {
					System.out.println(mat[i-1][col_start]);
				}
				col_start++;	
			}
			
		}
	}

}
