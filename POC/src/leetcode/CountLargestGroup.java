/**
 * 
 */
package leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Apr 5, 2020
 */
public class CountLargestGroup {

	/*	1399. Count Largest Group
	Given an integer n. Each number from 1 to n is grouped according to the sum of its digits. 
	Return how many groups have the largest size.*/
	/*	Input: n = 13
	Output: 4
	Explanation: There are 9 groups in total, they are grouped according sum of its digits of numbers 
	from 1 to 13:
	[1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9]. There are 4 groups with largest size.*/
	//get digit sum, get max from map values, count max==map.get().
	public static void main(String[] args) {
		int n = 13;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=1;i<=n;i++) {
			map.put(getSum(i), map.getOrDefault(getSum(i),0)+1);
		}
		
		int max = Collections.max(map.values());
		int count=0;
		for(Integer i : map.keySet()) {
			if(max==map.get(i))
				count++;
		}
		System.out.println(count);

	}
	static int getSum(int n) {
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}

}
