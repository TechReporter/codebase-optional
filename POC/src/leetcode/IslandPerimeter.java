/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Mar 11, 2020
 */
public class IslandPerimeter {

	public static void main(String[] args) {
		int[][] grid = {{0,1,0,0},
				 		{1,1,1,1},
				 		{0,1,0,0},
				 		{1,1,0,0}};
		int perimeter =0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(grid[i][j]==1 && count(grid,i,j)) {
					if(i==0 || grid[i-1][j]==0)
					perimeter++;
					if(i==grid.length-1 || grid[i+1][j]==0)
						perimeter++;
					if(j==0 || grid[i][j-1]==0)
						perimeter++;
					if(j==grid[0].length-1 || grid[i][j+1]==0)
						perimeter++;
				}
			}
		}
		System.out.println(perimeter);

	}
	
	static boolean count(int[][] grid, int i,int j) {
		if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0) {
			return false;
		}
		return true;
	}

}
