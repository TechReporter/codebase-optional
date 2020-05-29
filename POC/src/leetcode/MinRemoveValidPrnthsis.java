/**
 * 
 */
package leetcode;

import java.util.Stack;

/**
 * @author 212720190
 * @date Apr 5, 2020
 */
public class MinRemoveValidPrnthsis {
//1249. Minimum Remove to Make Valid Parentheses
	//lee(t(c)o)de)
	public static void main(String[] args) {
		removeMinParenthesis();
	}

private static String removeMinParenthesis() {
	String s = "())()(((";
	StringBuilder str=new StringBuilder();
	StringBuilder res=new StringBuilder();

	Stack<Character> stk = new Stack<>();
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==')' && stk.isEmpty()) {
			continue;
		} else if(s.charAt(i)=='(') {
			stk.push('(');
			str.append('(');
		} else if(s.charAt(i)==')') {
			str.append(')');
			stk.pop();
		} else {
			str.append(s.charAt(i));
		}	
	}
	for(int i=str.length()-1;i>=0;i--) {
		if(str.charAt(i)=='(' && !stk.isEmpty()) {
			stk.pop();
			continue;
		}
		res.append(str.charAt(i));
	}
	res.reverse();
	return res.toString();
}

}
