package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 212720190
 * @date Mar 17, 2020
 */
public class StockExchangeMatch {


	public static void main(String[] args) {
		List<Integer> s = Arrays.asList(1,10,3);
		List<Integer> p = Arrays.asList(10,5,7);
		List<Integer> q = Arrays.asList(2,22,123,6,5);
		List<Integer> result = new ArrayList<Integer>();

		int pos = 0;
		for(Integer i : q) {
			int k=0;
			int max = -9999;
			for(Integer j : s) {
				if(j<=i) {
					max = Math.max(j, max);
					if(j>=max) {
					pos = k;
					}
				}
				k++;
			}
			result.add(p.get(pos));
		}
	}

}
