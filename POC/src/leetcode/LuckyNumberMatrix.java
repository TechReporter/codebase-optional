/**
 * 
 */
package leetcode;

import java.util.PriorityQueue;

/**
 * @author 212720190
 * @date Apr 5, 2020
 */
public class LuckyNumberMatrix {

	/*1380. Lucky Numbers in a Matrix
	Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
	A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.*/
	public static void main(String[] args) {

		int[][] arr = {{3,7,8},{9,11,13},{15,16,17}};
		int colIndex = 0;
		for(int i=0;i<arr.length;i++) {
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for(int j=0;j<arr[0].length;j++) {
				if(min>arr[i][j]) {
					min = arr[i][j];
					colIndex=j;
				}
			}
			for(int m=0;m<arr.length;m++) {
				max=Math.max(max, arr[m][colIndex]);
			}
			if(max==min) {
				System.out.println(max);
				break;
			}
		}
	}

}
