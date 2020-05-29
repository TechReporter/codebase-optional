/**
 * 
 */
package datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Jul 6, 2019
 */
//get freq of most occurred element
public class BirdMigrateFreq {

	public static void main(String[] args) {

		int[] arr = {1, 4, 4, 4, 5, 3};
		Map<Integer,Integer> map = new HashMap<>();
		int temp = Integer.MIN_VALUE;
		int num = 0;
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i])!=null) {
				map.put(arr[i], map.get(arr[i])+1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>temp) {
				num=entry.getKey();
				temp=entry.getValue();
			}
		}
		
		System.out.println("num :"+num+" freq :"+temp);
		
	}

}
