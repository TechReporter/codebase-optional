/**
 * 
 */
package stringpractice;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author 212720190
 * @date Mar 5, 2020
 */
//todo not completed
public class LongestCommonPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] str = {"aca","cba"};
		PriorityQueue<String> q = new PriorityQueue<>((a,b)->a.length()-b.length());
		String res = "";
		q.addAll(Arrays.asList(str));
		int minLen = q.remove().length();
		int p=0;
		while(minLen>0) {
			int count=0;
			int i=0;
			char cc = str[i].charAt(p);
			for(;i<str.length;i++) {
				if(cc==str[i].charAt(p)) {
					count++;
				}
			}
			if(count==str.length)
				res=res.concat(String.valueOf(cc));
			else {
				break;
			}
			p++;
			minLen--;	
		}
		System.out.println(res);
		
	}
}
