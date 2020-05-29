/**
 * 
 */
package datastructure;

import java.util.Map;

import experimentImpl.CustomMap;
import experimentImpl.MapImplementor;

/**
 * @author 212720190
 * @date Sep 7, 2019
 */
public class CircularReplaceByNextTwo {

	public static void main(String[] args) {
		
		CustomMap<String, Integer> map = new MapImplementor<>();
		
		 for (Map.Entry<String, Integer> entry : map.entrySet())
		     System.out.println(entry.getKey()+ entry.getValue());
		
		Integer value = map.computeIfAbsentCustom("mani", String::length);
		System.out.println(value);
		 for (Map.Entry<String, Integer> entry : map.entrySet())
		     System.out.println(entry.getKey()+ entry.getValue());
		/*

		int[] arr = {2,4,1,6,8,6};
		int frst = arr[0];
		int scnd = arr[1];
		int i=0;
		for(i=0;i<arr.length-2;i++) {
			arr[i] = arr[i+1]+arr[i+2];
		}
		arr[i+1]=arr[arr.length-1]+frst;
		arr[arr.length-1] =frst+scnd;
		
		System.out.println(Arrays.toString(arr));
	*/}

}
