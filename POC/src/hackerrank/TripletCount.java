package hackerrank;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

/**
 * @author 212720190
 * @date Mar 12, 2020
 */
public class TripletCount {

	public static void main(String[] args) {
		int[] arr = {1,2,2,4};
		int r = 2;
		Map<Integer, Integer> map = new HashedMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(i, arr[i]);
		}
		int count = 0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]/arr[i]==r) {
					for(Integer key : map.keySet()) {
						if((key>i && key>j) && 
								(arr[key]/arr[j]==r)) {
							count++;	
						}
					}	
				}
			}
		}
		System.out.println(count);
	}

}
