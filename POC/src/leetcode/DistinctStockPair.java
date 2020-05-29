/**
 * 
 */
package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author 212720190
 * @date Apr 2, 2020
 */
public class DistinctStockPair {

	
	public static void main(String[] args) {
		stockPairs(Arrays.asList(6
				,12
				,3
				,9
				,3
				,5
				,1), 12);

	}
	
	 public static void stockPairs(List<Integer> stocksProfit, long target) {
		    // Write your code here
		        Set<Integer> set = new HashSet<>();
		        int count=0;
		        set = stocksProfit.stream().collect(Collectors.toSet());
		        for(Integer i : stocksProfit) {
		        	if(set.contains((int)target-i)) {
		        		count++;
		        		set.remove((int)target-i);
		        		set.remove(i);
		        	}
		        	
		        }
		        System.out.println(count);
		    }

}
