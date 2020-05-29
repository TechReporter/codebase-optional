/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Mar 11, 2020
 */
public class CountIsland {


	public static void main(String[] args) {
		char[][] grid = {{'1','1','1','1','0'},
						 {'1','1','0','1','0'},
						 {'1','1','0','0','0'},
						 {'0','0','0','0','0'}};

		System.out.println(numIslands(grid));
	}

	public static int numIslands(char[][] grid) {
		int countIsland=0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(grid[i][j]=='1') {
					countIsland+=connectedIsland(grid,i,j);
				}
			}
		}
		return countIsland;
	}

	static int connectedIsland(char[][] grid, int row, int col) {
		if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]=='0') {
			return 0;
		}
		grid[row][col]='0';
		connectedIsland(grid, row+1,col);
		connectedIsland(grid, row-1,col);
		connectedIsland(grid, row,col+1);
		connectedIsland(grid, row,col-1);
		return 1;
	}

}
