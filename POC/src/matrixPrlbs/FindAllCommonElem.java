package matrixPrlbs;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Aug 1, 2019
 */
public class FindAllCommonElem {

	public static void main(String[] args) {
		int arr[][] = { { 9, 8, 7, 1 }, 
				{ 7, 3, 1, 2 }, 
				{ 9, 7, 1, 2 }, 
				{ 6, 3, 1,7 } }; 

		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[0][i], 1);
		}
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(map.get(arr[i][j]) !=null) {
					map.put(arr[i][j], map.get(arr[i][j])+1);
				}
			}
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()==arr.length)
				System.out.println(entry.getKey());
		}
	}
}
