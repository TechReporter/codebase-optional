/**
 * 
 */
package matrixPrlbs;

public class TransposeMatrix {

	public static void main(String[] args) {

		 int mat[][] = {
				 {0, 6, 8, 9, 11}, 
                 {20, 22, 28, 29, 31}, 
                 {36, 38, 50, 61, 63}, 
                 {64, 66, 100, 122, 128}
                 }; 
		 int tmat[][] = new int[5][4];
		 transposeMatrix(mat,tmat);
		 
		 for (int i = 0; i<5; i++) 
	        { 
	            for (int j = 0; j<4; j++) 
	            System.out.print(tmat[i][j] + " "); 
	            System.out.print("\n"); 
	        } 
	}	
	
	static void transposeMatrix(int mat[][], int tmat[][]) {
		for(int i = 0; i<5; i++) {
			for(int j=0; j<4;j++) {
				tmat[i][j] = mat[j][i];
			}
		}

	}
}
