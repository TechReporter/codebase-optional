package datastructure;

/**
 * @author 212720190
 * @date May 23, 2019
 */
public class PrintMatrixZform {

	public static void main(String[] args) {
		int[][] mat	= { {1, 2, 3},
						{4, 5, 6},
						{7, 8, 9}};
		
		int diag = mat.length-1;
		int row = 0;
		int col =0;
		while(row<mat.length) {
			for(int i=col;i<mat.length;i++) {
				System.out.println(mat[row][i]);
			}
			row += mat.length-1;
			for(int i=1;i<mat.length;i++) {
				if(diag==mat.length-i)
					System.out.println(mat[i][diag-1]);
				diag--;
			}	
			col++;
		}
		
	}

}
