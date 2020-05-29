package hackerrank;

import java.util.PriorityQueue;

/**
 * @author 212720190
 * @date Mar 12, 2020
 */
public class RunningStreamMedian {

	public static void main(String[] args) {
		int[] arr = {3,6,1,8,9,5};
		PriorityQueue<Integer> maxLower = new PriorityQueue<>((a,b)->b-a);
		PriorityQueue<Integer> minHigher = new PriorityQueue<>();
		
		for(int i=0;i<arr.length;i++) {
			addNumber(maxLower, minHigher, arr[i]);
			balanceBucket(maxLower, minHigher);
			System.out.println(findMedian(maxLower, minHigher));
		}
		
	}
	
	static void addNumber(PriorityQueue<Integer> maxLower,PriorityQueue<Integer> minHigher,int number) {
		if(maxLower.size()==0 || number<maxLower.peek()) {
			maxLower.add(number);
		} else {
			minHigher.add(number);
		}
	}
	
	static void balanceBucket(PriorityQueue<Integer> maxLower,PriorityQueue<Integer> minHigher) {
		PriorityQueue<Integer> large = maxLower.size()>minHigher.size()?maxLower:minHigher;
		PriorityQueue<Integer> small = maxLower.size()>minHigher.size()?minHigher:maxLower;

		if(large.size()-small.size()>=1) {
			small.add(large.poll());
		}
	}
	
	static double findMedian(PriorityQueue<Integer> maxLower,PriorityQueue<Integer> minHigher) {
		PriorityQueue<Integer> large = maxLower.size()>minHigher.size()?maxLower:minHigher;
		PriorityQueue<Integer> small = maxLower.size()>minHigher.size()?minHigher:maxLower;
		double number = 0;
		if(large.size()==small.size()) {
			number = (double)(large.peek()+small.peek())/2;
		} else {
			number = large.peek();
		}
		return number;
	}

}
