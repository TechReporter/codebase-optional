package matrixPrlbs;

public class SwapFirstLastMatrix {
	//swap first and last column
	public static void main(String[] args) {
		int mat[][] = {
				{0, 6, 8, 9, 11}, 
				{20, 22, 28, 29, 31}, 
				{36, 38, 50, 61, 63}, 
				{64, 66, 100, 122, 128}
		}; 

		//swapColData(mat);
		swapRowData(mat);
		for (int i = 0; i<4; i++) 
		{ 
			for (int j = 0; j<5; j++) 
				System.out.print(mat[i][j] + " "); 
			System.out.print("\n"); 
		} 
	}

	static void swapColData(int mat[][]) {
		int temp = 0;
		for(int i =0; i<mat.length;i++) {
			temp = mat[i][0];
			mat[i][0] = mat[i][mat.length];
			mat[i][mat.length] = temp;
		}
	}

	static void swapRowData(int mat[][]) {
		int temp = 0;
		for(int i =0; i<mat.length;i++) {
			temp = mat[0][i];
			mat[0][i] = mat[mat.length-1][i];
			mat[mat.length-1][i] = temp;
		}
	}

}
