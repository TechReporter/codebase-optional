
package com;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author 212720190
 * @date Dec 31, 2018
 */
public class FindSmallestPairSum {

	public static void main(String[] args) {
		int[] arrData = {1,8,4,6,2,3};
		System.out.println(smallestPairSum(arrData));
	}

	static int smallestPairSum(int[] arr) {
		PriorityQueue<Integer> data = new PriorityQueue<>();
		Set<Integer> setData = new HashSet<Integer>();
		for(int i = 0; i<arr.length; i++) {
			data.add(arr[i]);
			setData.add(arr[i]);
			
		}
		int fValue = data.poll();
		int sValue = data.poll();
		if(setData.contains(sValue+fValue)) 
			return sValue+fValue;
		else
			return -1;
			
	}
	
}
