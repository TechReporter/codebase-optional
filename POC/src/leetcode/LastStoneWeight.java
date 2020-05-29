package leetcode;

import java.util.PriorityQueue;

/**
 * @author 212720190
 * @date Mar 31, 2020
 */
public class LastStoneWeight {

	//1046 last stone weight
	public static void main(String[] args) {
		int[] arr = {2,7,4,1,8,1};
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		while(!pq.isEmpty()) {
			if(pq.size()==1)
				break;
			int max1 = pq.remove();
			int max2 = pq.remove();
			if(max1!=max2) {
				pq.add(Math.abs(max1-max2));
			}
		}
		if(!pq.isEmpty())
		System.out.println(pq.remove());
		else
			System.out.println(0);
	}
}
