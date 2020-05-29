package backtracking;

/**
 * @author 212720190
 * @date Jan 26, 2020
 */
public class PathInMaze {

	public static void main(String[] args) {
		int[][] arr = {{1,1,1,0,1},
				{0,1,1,0,1},
				{0,1,1,1,1},
				{1,1,0,1,1}};
		traversePossible(arr);
	}

	static void traversePossible(int[][] arr) {
		int[][] res = new int[arr.length][arr[0].length];
		if(mazeUtil(arr, 0, 0, res)) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					System.out.print(res[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

	static boolean mazeUtil(int[][] arr, int x,int y, int[][] res) {
		int row = arr.length;
		int col = arr[0].length;

		if(x==row-1 && y==col-1) {
			res[x][y]=1;
			return true;
		}
		if(canMove(arr, x, y,row,col)==1) {
			res[x][y] = 1;
			if(mazeUtil(arr, x+1, y, res)) {
				return true;
			}
			if(mazeUtil(arr, x, y+1, res)) {
				return true;
			}
			res[x][y]=0; //this is backtrack and made ell 0 if no way path possible
			return false;
		}
		return false;
	}
	static int canMove(int[][] arr, int x,int y,int row,int col) {
		if(x>=0 && x<row && y>=0 && y<col && arr[x][y]==1)
			return 1;
		return 0;
	}
}