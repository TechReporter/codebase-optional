/**
 * 
 */
package com;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 212720190
 * @date Jan 19, 2019
 */
public class PrintUniqueRows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int mat[][] = { { 10, 20, 2, 0}, 
        	    { 1, 0, 0, 30}, 
                { 10, 20, 2, 0}, 
                { 0, 0, 2, 20}  
					}; 
		
		printUniqueRows(mat,4,4);
	}
	
	static void printUniqueRows(int arr[][],int r,int c) {
		
		Set<String> setData = new HashSet<>();
		for(int i = 0; i<r;i++) {
			String str = "";
			for(int j = 0; j<c;j++) {
				str=str.concat(",").concat(String.valueOf(arr[i][j]));
			}
			if(!setData.contains(str)) {
				setData.add(str);
				System.out.println(str.substring(1,str.length()));
			}
		}
	}

}
