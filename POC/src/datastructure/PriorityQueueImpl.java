/**
 * 
 */
package datastructure;

import java.util.PriorityQueue;

/**
 * @author 212720190
 * @date Dec 16, 2019
 */
public class PriorityQueueImpl {
//connect n rope with minimim cost.
	//here 2+3=5, 4+5=9, 9+6=15. total=5+9+15=29.
	public static void main(String[] args) {

		PriorityQueue<Integer> arr = new PriorityQueue<>();
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(6);
		int result = 0;
		while(arr.size()>1) {
			int first = arr.poll();
			int second = arr.poll();
			result+=first+second;
			arr.add(first+second);
		}
		
		System.out.println(result);
	}

}
