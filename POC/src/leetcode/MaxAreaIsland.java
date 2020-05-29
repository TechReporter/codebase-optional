/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Mar 11, 2020
 */
public class MaxAreaIsland {

	public static void main(String[] args) {

		int[][] grid = {{1,1,0,1,0},
				 {0,1,0,1,0},
				 {1,1,0,0,1},
				 {0,0,1,1,1}};
		 if(grid.length==0 || grid==null)
	          System.out.println(0);
	       
		System.out.println(numIslands(grid));
	}
	
	public static int numIslands(int[][] grid) {
		int countIsland=0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(grid[i][j]==1) {
					int count = 0;
					countIsland = Math.max(countIsland, connectedIsland(grid,i,j,count));
				}

			}
		}
		return countIsland;
	}

	static int connectedIsland(int[][] grid, int row, int col, int count) {
		int islandSize=0;
		if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0)            {
			return 0;
		}
		grid[row][col]=0;
		islandSize+=connectedIsland(grid, row+1,col,islandSize);
		islandSize+=connectedIsland(grid, row-1,col,islandSize);
		islandSize+=connectedIsland(grid, row,col+1,islandSize);
		islandSize+=connectedIsland(grid, row,col-1,islandSize);
		return islandSize+1;
	}

}
