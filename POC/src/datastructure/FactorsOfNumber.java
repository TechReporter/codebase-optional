/**
 * 
 */
package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Tanmoy Dasgupta
 * @date Nov 24, 2019
 */
public class FactorsOfNumber {

//get all factors, and factor on a position
	public static void main(String[] args) {
		System.out.println(factor(45,3));
	}

	static long factor(long n, long p) {
		List<Long> arr = new ArrayList<>();
		for(long i=1;i<=Math.sqrt(n);i++) {

			if(n%i==0) {
				if(n/i==i) {
					arr.add(i);
				} else {
					arr.add(i);
					arr.add(n/i);
				}
			}
		}
		if(p>arr.size()) {
			return 0;
		}
		System.out.println(arr);
		return arr.get((int)p);
	}
}
