package datastructure;

/**
 * @author 212720190
 * @date May 19, 2019
 */
public class FindNumberFromSortArray {

	public static void main(String[] args) {

		int[][] arr = {{3,4,6},
					   {5,8,11},
					   {7,9,13}};
		int n = 13;
		int i=0,j=arr.length-1;

		while(i<arr.length && j>=0) {
			if(n==arr[i][j]) {
				System.out.println(arr[i][j]+" at "+"{"+i+","+j+"}");
				return;
			} 
			if(n>arr[i][j]) {
				i++;
			} else {
				j--;
			}
		}
		
	}

}
