package datastructure;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Apr 20, 2020
 */
public class AllElementSameMinCost {

	
	public static void main(String[] args) {
		int[] A = { 1, 5, 7, 10 };
		//sort in asc order, get middle elem. cost diff from each
		//elem to middle, for even elem, get min of two middle
		//time complx O(nlogn)
		Arrays.sort(A);
		int cost=0;
		int mid = A[A.length/2];
		for(int i=0;i<A.length;i++) {
			cost+=
		}

	}

}
