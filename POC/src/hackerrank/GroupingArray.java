package hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212720190
 * @date Mar 18, 2020
 */
public class GroupingArray {
//grouping array, (3),{4,1},{7,5,9}
	public static void main(String[] args) {
		int[] arr = {3,4,1,7,5,9,2};
		List<List<Integer>> list = new ArrayList<>();
			int i=0;
			int k=0;
			while(i<arr.length) {
				List<Integer> ll = new ArrayList<>();
				int j=0;
				while(j<=i) {
					if(k==arr.length)
						break;
					ll.add(arr[k++]);
					j++;
				}
				list.add(ll);
				if(k==arr.length)
					break;
				i++;
			}
			System.out.println(list.get(2).stream().mapToInt(Integer::intValue).sum());
	}
}
