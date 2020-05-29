/**
 * 
 */
package leetcode;

import java.util.Stack;

/**
 * @author 212720190
 * @date Mar 29, 2020
 */
public class BackspaceString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "a#c";
		String t = "#a#c";
		Stack<Character> stk = new Stack<>();
		Stack<Character> stk1 = new Stack<>();
		int i=0;
		int j=0;
		StringBuilder sb = new StringBuilder(); 
		StringBuilder sb1 = new StringBuilder(); 
		while(i<s.length() || j<t.length()) {
			if(i<s.length()) {
				if(s.charAt(i)!='#') {
					stk.push(s.charAt(i));
				} else if(!stk.isEmpty()) {
					stk.pop();
				}
			}
			
			if(j<t.length()) {
				if(t.charAt(j)!='#') {
					stk1.push(t.charAt(j));
				} else if(!stk1.isEmpty()) {
					stk1.pop();
				}
			}
			i++;
			j++;
		}
		while(!stk.isEmpty())
			sb.append(stk.pop());
		while(!stk1.isEmpty())
			sb1.append(stk1.pop());
		System.out.println(sb.reverse().toString()+" "+sb1.reverse().toString());

	}

}
