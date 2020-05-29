/**
 * 
 */
package com;

/**
 * @author 212720190
 * @date Jan 19, 2019
 */
public class PrintDiagonalArray {

	public static void main(String[] args) {

		int mat[][] = { { 10, 20, 2, 0}, 
                	    { 1, 0, 0, 30}, 
                        { 0, 10, 4, 0}, 
                        { 1, 0, 2, 20}  
							}; 
		printDiagArr(mat);
	}

		static void printDiagArr(int[][] arr) {
		
			System.out.println("*****top right diagonal*******");
			for(int i = 0; i<arr.length; i++) {
				System.out.println(arr[i][i]);
			}
			
			System.out.println("*****bottom left diagonal*******");
			for(int j = arr.length -1; j>=0; j--) {
				System.out.println(arr[j][j]);
			}
			
			System.out.println("****top left diagona*******");
			int kk = arr.length-1;
			for(int k = 0; k<arr.length;k++) {
					if(kk == arr.length-1-k)
					System.out.println(arr[k][kk]);
					kk--;
			}
			
			System.out.println("*****bottom right diagonal*******");
			int mm = 0;
			for(int m = arr.length-1; m>=0; m--) {
					if(mm == arr.length-1-m)
					System.out.println(arr[m][mm]);
					mm++;
			}	
	}
}
