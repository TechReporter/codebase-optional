/**
 * 
 */
package Arraypractice;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 212720190
 * @date Mar 5, 2020
 */
public class HappyNumber {

	
	//a happy number which sum square of digit become 1. keep on this process untill 1.  
	public static void main(String[] args) {

		int number=8;
		System.out.println(happy(number));		
	}
	static boolean happy(int number) {
		Set<Integer> set = new HashSet<>();
		while(!set.contains(number)) {
			set.add(number);
			number=getNum(number);
			if(number==1) {
				return true;
			}
		}
		
		return false;
	}
	static int getNum(int val) {
		int sum=0;
		while(val>0) {
			int digit=val%10;
			sum+=Math.pow(digit, 2);
			val/=10;
		}
		return sum;
	}

}
