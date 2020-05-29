package datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Apr 30, 2019
 */
public class FindTripletsWithGivenSum {

	public static void main(String[] args) {
		int[] arr = {2,4,1,6,3,7,8,5};
		int sum = 11;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
		map.put(arr[i], i);	
		}
		
		for(int i = 0;i<arr.length-1;i++) {
			for(int j =i+1;j<arr.length;j++) {
				int k = 0;
				int val = sum -(arr[i]+arr[j]);
				if(map.containsKey(val)) {
					k = map.get(val);
					if(map.get(val)!=i && map.get(val) !=j)
					System.out.println(arr[i]+","+arr[j]+","+arr[k]);
				}
			}
		}
		
		//alternate approach
		for(int i = 0;i<arr.length-2;i++) {
			for(int j = i+1;j<arr.length-1;j++) {
				for(int k =j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==sum) {
						System.out.println(arr[i]+","+arr[j]+","+arr[k]);
					}
				}
			}
		}
		
	}

}
