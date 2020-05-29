/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author 212720190
 * @date Apr 2, 2020
 */
public class FindKClosestPoint {
	
	static class Position {
		int position;
		double data;
		public Position(int position,double data) {
			this.position=position;
			this.data=data;
		}
		public int getPosition() {
			return position;
		}
		public void setPosition(int position) {
			this.position = position;
		}
		public double getData() {
			return data;
		}
		public void setData(double data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		int k=2;
		int[][] arr = {{3,3},{5,-1},{-2,4}};
		int[][] result = new int[k][2];
		List<Position> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			double sqrt = Math.sqrt(arr[i][0]*arr[i][0]+arr[i][1]*arr[i][1]);
			list.add(new Position(i, sqrt));
		}
		Collections.sort(list,Comparator.comparing(Position::getData));
		for(int i=0;i<k;i++) {
			Position p = list.get(i);
			result[i][0]=arr[p.getPosition()][0];
			result[i][1]=arr[p.getPosition()][1];
		}
	}

}
