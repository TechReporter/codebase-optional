/**
 * 
 */
package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 212720190
 * @date Mar 29, 2020
 */
public class MovingAverageFromStream {
	static int size;
	static int pointer;
	static Queue<Integer> q;
	public MovingAverageFromStream(int size) {
		this.size=size;
		q = new LinkedList<>();
	}
	
	static void addNext(int val) {
		if(pointer<size) {
			q.add(val);
			pointer++;
		}
		else {
			q.remove();
			q.add(val);
		}
	}
	static int getAvg() {
		int sum=0;
		int size = q.size();
		sum = q.stream().mapToInt(Integer::intValue).sum();
		return sum/size;
	}
	//346 letcode
	public static void main(String[] args) {
		MovingAverageFromStream obj = new MovingAverageFromStream(3);
		addNext(1);
		addNext(10);
		System.out.println(getAvg());
		addNext(3);
		System.out.println(getAvg());
		addNext(5);
		System.out.println(getAvg());
	}
}
