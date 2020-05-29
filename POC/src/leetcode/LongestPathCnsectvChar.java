package leetcode;

/**
 * @author 212720190
 * @date Mar 19',' 2020
 */
public class LongestPathCnsectvChar {

	public static void main(String[] args) {
		char[][] mat = {{'D','E','H','X','B'},
						{'A','O','G','P','E'},
						{'D','D','C','F','D'},
						{'E','B','E','A','S'},
						{'C','D','Y','E','N'}};
		char chr = 'C';
		int count =0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(mat[i][j]==chr) {
					count = Math.max(count, countMaxConsecutiveChar(mat, i, j, chr, 0));
				}
			}
		}
		System.out.println(count);
	}

	static int countMaxConsecutiveChar(char[][] mat, int row, int col, char chr,int count) {
		int i=row;
		int j=col;
		int countMax = 0;
		if(row<0 || row>mat.length || col<0 || col>mat[0].length) {
			if(row!=i && col!=j && mat[row][col]!=(char)(chr+1))
			return 0;
		}
		mat[row][col]='@';
		countMax+=countMaxConsecutiveChar(mat, row+1, col, (char)(chr+1), countMax);
		countMax+=countMaxConsecutiveChar(mat, row-1, col, (char)(chr+1), countMax);
		countMax+=countMaxConsecutiveChar(mat, row, col+1, (char)(chr+1), countMax);
		countMax+=countMaxConsecutiveChar(mat, row, col-1, (char)(chr+1), countMax);
		countMax+=countMaxConsecutiveChar(mat, row+1, col+1, (char)(chr+1), countMax);
		countMax+=countMaxConsecutiveChar(mat, row+1, col-1, (char)(chr+1), countMax);
		countMax+=countMaxConsecutiveChar(mat, row-1, col+1, (char)(chr+1), countMax);
		countMax+=countMaxConsecutiveChar(mat, row-1, col-1, (char)(chr+1), countMax);
		return countMax+1;
		
	}
}
