/**
 * 
 */
package datastructure;

import java.util.PriorityQueue;

/**
 * @author 212720190
 * @date Feb 10, 2020
 */
public class MergeKarrayInSorted {

	
	public static void main(String[] args) {

		int[][] arr = {{2,1,5,4},
						{6,3,1,8},
						{10,7,9,12}};
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				q.add(arr[i][j]);
			}
		}
		while(!q.isEmpty()) {
			System.out.print(q.remove()+" ");
		}
	}
}
