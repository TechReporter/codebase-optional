/**
 * 
 */
package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author 212720190
 * @date Jan 19, 2019
 */
public class CommonElmentinAllRows {

	public static void main(String[] args) {
		int mat[][] = { { 10, 20, 2, 0}, 
        	    { 10, 2, 0, 30}, 
                { 10, 20, 2, 0}, 
                { 0, 0, 2, 10}  
					};
		
		System.out.println(findCommonElement(mat,4,4));
	}
	
	static Set<Integer> findCommonElement(int arr[][], int r, int c) {
		int k = 0;
		int[]tempArr = new int[(r-1)*c];
		Set<Integer> setData = new HashSet<>();
		
		for(int i = 0,j = 0; j<c;j++) {
			setData.add(arr[i][j]);
		}

		for(int i = 1; i<r;i++) {
			for(int j = 0;j<c;j++) {
				if(setData.contains(arr[i][j])) {
					tempArr[k] = arr[i][j];
				}
				k++;
			}
		}

		 Map<Integer, Integer> count_map = new HashMap<>(); 
	        for (int i = 0; i < (r-1)*c; i++) { 
	            int a = 0; 
	            if(count_map.get(tempArr[i])!=null){ 
	                a = count_map.get(tempArr[i]); 
	            } 
	              
	            count_map.put(tempArr[i], a+1); 
	        }
	        Set<Integer> retData = new HashSet<>();
	        for (int i = 0; i < (r-1)*c; i++) // if count of element == k ,then 
	        // it is the required first element  
	        { 
	            if(count_map.get(tempArr[i]) == 3) { 
	            	retData.add(tempArr[i]);
	            } 
	        }
            return retData;
	}

}
