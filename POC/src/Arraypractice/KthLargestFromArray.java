/**
 * 
 */
package Arraypractice;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author 212720190
 * @date Feb 5, 2020
 */
public class KthLargestFromArray {

//any kth largest, smallest problem heap is best, in O(n) time sort 
	public static void main(String[] args) {
		int[] arr = {3,2,1,5,6,4};
		int k=2;
		System.out.println(findKthLargest(arr, k));
		System.out.println(findKthSmallest(arr,k));
	}

	static int findKthLargest(int[] nums, int k) {
		//can be solved using priorityQueue, as its default mean heap nature
		//then removeif size > k, so k item left and kth largest item will be as //root.
		if(k<1 || k>nums.length) {
			return -1;
		}
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i=0;i<nums.length;i++) {
			q.add(nums[i]);
			if(q.size()>k)
				q.remove();
		}
		return q.peek();
	}
	
	//for kth smallest use max heap, by Comparator reverseOrder
	static int findKthSmallest(int[] nums, int k) {
		
		if(k<1 || k>nums.length) {
			return -1;
		}
		PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0;i<nums.length;i++) {
			q.add(nums[i]);
			if(q.size()>k)
				q.remove();
		}
		return q.peek();
	}

}
