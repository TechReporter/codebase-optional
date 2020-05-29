/**
 * 
 */
package Arraypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author 212720190
 * @date Mar 24, 2020
 */
public class MinimumHallRequired {

	static class Interval {
		int start;
		int end;
		public Interval(int start, int end) {
			this.start=start;
			this.end=end;
		}
	}
	
	public static void main(String[] args) {
		List<Interval> list = new ArrayList<>();
		int[][] arr = {{0, 5}, {1, 2}, {6, 10}};
		for(int i=0;i<arr.length;i++) {
			Interval obj = new Interval(arr[i][0], arr[i][1]);
			list.add(obj);
		}
		Collections.sort(list,(a,b)->a.start-b.start);
		PriorityQueue<Interval> pq = new PriorityQueue<>((a,b)->a.end-b.end);
		pq.add(list.get(0));
		list.remove(0);
		
		for(Interval room : list) {
			Interval minRoom = pq.peek();
			if(room.start>=minRoom.end) {
				minRoom.end=room.end;
			} else {
				pq.add(room);
			}
		}
		System.out.println(pq.size());
		
		minRoomRequired();
	}
	
	static void minRoomRequired() {
		int[][] arr = {{0, 5}, {1, 2}, {6, 10}};
		int[] start = new int[arr.length];
		int[] end = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			start[i]=arr[i][0];
			end[i]=arr[i][1];
		}
		Arrays.sort(start);
		Arrays.sort(end);
		int count=1;
		int minrRoomRequired=1;	
		int startM=1;
		int endM=0;
		while(startM<start.length) {
			if(start[startM]>=end[endM]) {
				endM++;
				minrRoomRequired--;
			} else {
				startM++;
				minrRoomRequired++;
			}
			count=Math.max(minrRoomRequired, count);
		}
		System.out.println(count);
	}

}
