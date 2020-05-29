/**
 * 
 */
package datastructure;

import java.util.Stack;

/**
 * @author 212720190
 * @date Dec 25, 2019
 */
public class UnMatchedBracketCount {
	public static void main(String[] args) {
		System.out.println(bracketMatch(")()"));
	}

	static int bracketMatch(String text) {

		char[] chr = text.toCharArray();
		Stack<Character> stk = new Stack<Character>();
		int count=0;
		for(int i=0;i< chr.length;i++) {
			if(stk.isEmpty() && chr[i]==')') {
				count++;
			} else if(chr[i]=='(') {
				count++;
				stk.push(chr[i]);
			} else {
				stk.pop();
				count--;
			}
		}
		return count;
	}
}
