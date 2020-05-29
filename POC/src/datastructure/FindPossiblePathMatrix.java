/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date May 31, 2019
 */
public class FindPossiblePathMatrix {

	//if path available from top left to bottom right, if -1 no way to move
	public static void main(String[] args) {

		int[][] arr = {{ 0, 0, 0, -1, 0},
                {-1, 0, 0, -1, -1},
                { 0, 0, 0, -1, 0},
                {-1, 0, 0,  0, 0},
                { 0, 0, -1,  0, 0}};
		
		arr[0][0] = 1;
		for(int i=1;i<arr.length;i++) {
			if(arr[0][i] != -1) {
				arr[0][i] = arr[0][i-1];
			}
		}
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i][0] != -1) {
				arr[i][0] = arr[i-1][0];
			}
		}
		
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i][j] != -1) {
					arr[i][j] = Math.max(arr[i][j-1], arr[i-1][j]);
				}
			}
		}
		if(arr[arr.length-1][arr.length-1] == 1) {
			System.out.println("path possible");
		}
		
	}

}
