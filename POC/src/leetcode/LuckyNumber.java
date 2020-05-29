/**
 * 
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Apr 4, 2020
 */
//leetcode contest 181
// a number which freq is same as number. if multiple return max number
public class LuckyNumber {


	public static void main(String[] args) {
		int[] arr = {5};
		System.out.println(findLucky(arr));
		 
	}
	
	 public static int findLucky(int[] arr) {
	        Integer max = -1;
	        Map<Integer,Integer> map = new HashMap<>();
	        for(int i=0;i<arr.length;i++) {
	        	if(map.get(arr[i])!=null)
	            map.put(arr[i],map.get(arr[i])+1);
	        	else
		            map.put(arr[i],1);
	        }
	        for(Map.Entry<Integer,Integer> m : map.entrySet()) {
	            if(m.getKey()==m.getValue()) {
	                max=Math.max(max, m.getKey());
	            }
	        }
        return max;
	    }

}
