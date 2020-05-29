/**
 * 
 */
package hackerrank;

import java.util.PriorityQueue;

/**
 * @author 212720190
 * @date Mar 9, 2020
 */
public class MaxHeapMinHeap {

	//max min heap can be implemented using priority queue. p queue is by default min heap.
	// to make max heap, order of collection has to reverse.
	//order in heap only maintain while removing
	public static void main(String[] args) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
		int[] arr = {2,5,1,7,8,6,4};
		for(int i=0;i<arr.length;i++) {
			minHeap.add(arr[i]);
			maxHeap.add(arr[i]);
		}
		//remove 3rd smallest
		int k=2;
		while(k-->0) {
			minHeap.remove();
		}
		System.out.println(minHeap.remove());

		//remove 3rd higest
		int m=2;
		while(m-->0) {
			maxHeap.remove();
		}
		System.out.println(maxHeap.remove());
	}
}
