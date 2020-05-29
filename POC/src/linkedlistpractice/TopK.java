/**
 * 
 */
package linkedlistpractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Apr 14, 2020
 */
public class TopK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] Score = {25,5,17,10,45};
		
	     Map<Integer,Integer> map = new HashMap<>();
	        for(int i=0;i<Score.length;i++) {
	            map.put(Score[i],i+1);
	        }
	        
	        Arrays.sort(Score);
	        int i=Score.length-1;
	        int j=0;
	        int[] res = new int[3];
	        while(i>=Score.length-3) {
	            res[j]=map.get(Score[i]);
	            i--;
	            j++;
	        }
	        System.out.println(Arrays.toString(res));
	}
	
	

}
