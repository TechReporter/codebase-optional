/**
 * 
 */
package matrixPrlbs;

/**
 * @author 212720190
 * @date Aug 1, 2019
 */
public class AllPathFirstToLastCell {

	public static void main(String[] args) {
		
		int mat[][] = 
			{ 
					{1, 2, 3, 4}, 
					{5, 6, 7, 8}, 
					{9, 10, 11, 12}, 
					{13, 14, 15, 16} 
			};
		System.out.println(path(mat.length,mat[0].length));

		int T1[][] = new int[4][4];
		
		for(int i=0; i < mat.length; i++){
			T1[i][0] = 1;
		}

		for(int i=0; i < mat.length; i++){
			T1[0][i] = 1;
		}
		
		for (int i = 1; i < mat.length; i++) {
			for (int j = 1; j < mat.length; j++) {
				T1[i][j] = T1[i-1][j]+T1[i][j - 1];
			}
		}
		System.out.println(T1[mat.length-1][mat.length-1]);
	}
	
	//recursive approach
	static int path(int m, int n) {
		if(m==0 && n==0) {
			return 0;
		} if(m==1 || n==1) {
			return 1;
		}
		
		return path(m,n-1)+path(m-1, n);
	}
}
