/**
 * 
 */
package datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author 212720190
 * @date Jan 4, 2020
 */
public class RemoveAdjacentDuplicate {

//remove adjacent duplicate. abbaca ->ca
	public static void main(String[] args) {

		String s = "abbbabaaa";
	
		System.out.println(solution1(s));
		System.out.println(solution2(s));
	}
	
	static String solution1(String s) {
		Stack<Character> stk = new Stack<>();
		StringBuilder ss = new StringBuilder("");
		char[] chr = s.toCharArray();
		for(int i=0;i<chr.length;i++) {
			if(stk.isEmpty() || stk.peek()!=chr[i]) {
				stk.push(chr[i]);
			} else {
				stk.pop();
			}
		}
		int k=stk.size();
		
		for(int j=0;j<=k;j++) {
			if(!stk.isEmpty()) {
				ss.append(stk.pop());
			}
		}
		return ss.reverse().toString();
	}
	
	static String solution2(String s) {
		List<Character> stk = new ArrayList<>();
		StringBuilder ss = new StringBuilder("");
		char[] chr = s.toCharArray();
		for(int i=0;i<chr.length;i++) {
			if(stk.isEmpty() || stk.get(stk.size()-1)!=chr[i]) {
				stk.add(chr[i]);
			} else {
				stk.remove(stk.size()-1);
			}
		}
		int k=0;

		while(k<stk.size()) {
			ss.append(stk.get(k));
			k++;
		}
		return ss.toString();
	}

}
