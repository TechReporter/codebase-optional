/**
 * 
 */
package datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author 212720190
 * @date Dec 11, 2019
 */

//find max min element in every subarray of k size
public class MaxMinInSubArraySizeK {
	// I am following sliding window technique
	public static void main(String[] args) {

		int[] arr = {4,2,5,7,3,4};
		int k =3;
		List<Integer> minlist = new ArrayList<Integer>();
		List<Integer> maxlist = new ArrayList<Integer>();

		PriorityQueue<Integer> min = new PriorityQueue<>();
		PriorityQueue<Integer> max = new PriorityQueue<>((a,b)->b-a);

		for (int i=0;i<arr.length-k+1;i++) {
			min.add(arr[i]);
			for(int j=i;j<i+k;j++) {
				if(arr[j]<min.peek()) {
					min.remove();
					min.add(arr[j]);
				}
				if(arr[j]>max.peek()) {
					max.remove();
					max.add(arr[j]);
				}
			}
			minlist.add(min.peek());
			min.remove();
			maxlist.add(max.peek());
			max.remove();
			//max.add(arr[i]);
		}
	}


}
