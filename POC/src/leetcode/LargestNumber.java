/**
 * 
 */
package leetcode;

import java.util.PriorityQueue;

/**
 * @author 212720190
 * @date Apr 1, 2020
 */
public class LargestNumber {

	//179. Largest Number
	public static void main(String[] args) {
		int[] arr = {3,30,34,5,9};
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i];
			while(temp>0) {
				int rem = temp%10;
				pq.add(rem);
				temp/=10;
			}
		}
		String s="";
		while(!pq.isEmpty()) {
			s=s.concat(String.valueOf(pq.remove()));
		}
		System.out.println(s);

	}

}
