/**
 * 
 */
package datastructure;

import java.util.Stack;

/**
 * @author 212720190
 * @date Jan 5, 2020
 */
public class RemoveKAdjacentDuplicate {


	//Given a string s, a k duplicate removal consists of choosing k adjacent and equal
	//letters from s and removing them causing the left and 
	//the right side of the deleted substring to concatenate together.
	public static void main(String[] args) {

		String s = "deeedbbcccbdaa";
		int k=3;
		int count=0;
		Stack<Character> stk = new Stack<>();
		char[] chr = s.toCharArray();
		StringBuilder ss = new StringBuilder("");
		for(int i=0;i<chr.length;i++) {
			if(stk.isEmpty() || (stk.peek()==chr[i] && count<k) || stk.peek()!=chr[i]) {
				stk.push(chr[i]);
				count++;
			} else {
				if(count==k) {
					while(count>1) {
						stk.pop();
						count--;
					}
						count=0;
				}
			}
		}
		int m=stk.size();
		for(int j=0;j<=m;j++) {
			if(!stk.isEmpty()) {
				ss.append(stk.pop());
			}
		}
		System.out.println(ss.reverse().toString());
	}

}
