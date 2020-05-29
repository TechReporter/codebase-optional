
package com;

import java.util.HashSet;
import java.util.Set;

public class MatchArrayValue {

	public static void main(String[] args) {
		int[] arrData = {3,4,6,2,9};
		System.out.println(findPairMatchWithPoduct(arrData));
	}

	static int findPairMatchWithPoduct(int[] arr) {
		
		Set<Integer> setVal = new HashSet<>();
		int matchCount = 0;
		for(int i = 0; i<arr.length; i++) {
			setVal.add(arr[i]);
		}
		for(int j = 0; j<arr.length; j++) {
			for(int k = 0; k<arr.length; k++) {
				if(setVal.contains(arr[j]*arr[k])) {
				matchCount++;
				System.out.println(arr[j]+","+arr[k]);
				}
			}
		}
		return matchCount;
	}
}
