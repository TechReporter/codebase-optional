/**
 * 
 */
package Arraypractice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212720190
 * @date Mar 27, 2020
 */
public class MinStepToPath {

	public static void main(String[] args) {
		int[][] arr = {{1,1,1,1},
				{1,2,1,1},
				{1,1,1,1},
				{1,1,1,1}};

		findPaths(arr,new ArrayList<>(),0,0);

	}
	
	public static void printPath(List<Integer> path, int last)
	{
		for (int i : path) {
			System.out.print(i + " - ");
		}
	}

	public static void findPaths(int[][] mat, List<Integer> path,
													int i, int j)
	{
		int M = mat.length;
		int N = mat[0].length;

		// if we have reached the last cell, print the route
		if (i == M - 1 && j == N - 1)
		{
			printPath(path, mat[i][j]);
			return;
		}

		// include current cell in path
		path.add(mat[i][j]);

		// move right
		if ((i >= 0 && i < M && j + 1 >= 0 && j + 1 < N)) {
			findPaths(mat, path, i, j + 1);
		}

		// move down
		if ((i + 1 >= 0 && i + 1 < M && j >= 0 && j < N)) {
			findPaths(mat, path, i + 1, j);
		}

		// remove current cell from path
		path.remove(path.size() - 1);

	/*static boolean isValid(int[][] arr, int i,int j, List) {
		if(i<0 || i>=arr.length || j<0 || j>=arr[0].length || arr[i][j]==0) {
			return false;
		}
		return true;
	}


	static int stepCount(int[][] arr,int i, int j, int val) {
		int step=0;
		if(isValid(arr, i, j)) {
			if(arr[i][j]==val) {
				return step;
			}
		}
		
		arr[i][j]=0;

		step+=stepCount(arr, i+1, j, val);
		step+=stepCount(arr, i, j+1, val);
		return step;
*/
	}
}
