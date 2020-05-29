/**
 * 
 */
package com;

/**
 * @author 212720190
 * @date Jan 19, 2019
 */
public class ConvertBooleanMatrix {

	public static void main(String[] args) {

		int mat[][] = { { 10, 20, 2, 0}, 
        	    { 1, 0, 0, 30}, 
                { 0, 10, 5, 0}, 
                { 0, 0, 2, 20}  
					}; 
		
		conertToBooleanMatrix(mat,4,4);
		printMatrix(mat,4,4);
	}
	
	static void conertToBooleanMatrix(int[][] arr,int n, int m) {
		
	     int row[ ]= new int [n]; 
	        int col[ ]= new int [m]; 
	        int i, j; 
	        
		 for (i = 0; i <n; i++) 
	        { 
	        row[i] = 0; 
	        } 
	      
		 for (i = 0; i < m; i++) 
	        { 
	        col[i] = 0; 
	        } 
	      
	        for (i = 0; i < n; i++) 
	        { 
	            for (j = 0; j < m; j++) 
	            { 
	                if (arr[i][j] == 1) 
	                { 
	                    row[i] = 1; 
	                    col[j] = 1; 
	                } 
	            } 
	        } 
	        for (i = 0; i < n; i++) 
	        { 
	            for (j = 0; j < m; j++) 
	            { 
	                if ( row[i] == 1 || col[j] == 1 ) 
	                { 
	                    arr[i][j] = 1; 
	                } 
	            } 
	        } 
	    } 

	  public static void printMatrix(int mat[ ][ ], int R, int C) { 
	        int i, j; 
	        for (i = 0; i < R; i++) 
	        { 
	            for (j = 0; j < C; j++) 
	            { 
	                System.out.print(mat[i][j]+ " "); 
	            } 
	            System.out.println(); 
	        } 
	    } 
}
