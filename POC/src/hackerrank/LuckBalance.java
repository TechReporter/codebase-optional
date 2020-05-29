/**
 * 
 */
package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author 212720190
 * @date Mar 28, 2020
 */
public class LuckBalance {

	/*Lena is preparing for an important coding competition that is preceded by a 
	 * number of sequential preliminary contests. Initially, her luck balance is 0. 
	 * She believes in "saving luck", and wants to check her theory.
	 *  Each contest is described by two integers,  and :

 is the amount of luck associated with a contest. If Lena wins the contest,
  her luck balance will decrease by ; if she loses it, her luck balance will increase by .
 denotes the contest's importance rating. It's equal to  if the contest 
 is important, and it's equal to  if it's unimportant.
If Lena loses no more than  important contests, what is the maximum amount 
of luck she can have after competing in all the preliminary contests? This value may be negative.

For example,  and:

Contest		L[i]	T[i]
1		5	1
2		1	1
3		4	0
If Lena loses all of the contests, her will be . Since she is allowed to lose  
important contests, and there are only  important contests. She can lose all 
three contests to maximize her luck at . If , she has to win at least  of the  
important contests. She would choose to win the lowest value important contest
 worth . Her final luck will be .*/
	public static void main(String[] args) {
		int[][] arr = {{5,1},{1,1},{4,0}};
		int k=1;
		int luckSave = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i][1]==1) {
				list.add(arr[i][0]);
			}
		}
		Collections.sort(list,Comparator.reverseOrder());
		if(k>0 && k<list.size()) {
			int i=list.size();
			while(i>k) {
				luckSave+=list.remove(k);
				i--;
			}
		}
		int res = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i][1]==0) {
				res+=arr[i][0];
			}
		}
		for(Integer i : list) {
			res+=i;
		}
		res-=luckSave;
		System.out.println(res);
	}

}
