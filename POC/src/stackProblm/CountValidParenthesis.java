package stackProblm;

import java.util.Stack;

public class CountValidParenthesis {
	//count valid parenthesis. )()(() --4

	public static void main(String[] args) {

		String str = "()(()";
		Stack<Character> stk = new Stack<>();
		int count=0;
		for(int i=0;i<str.length();i++) {

			if(stk.isEmpty() || str.toCharArray()[i]=='(')
				stk.add(str.toCharArray()[i]);
			else {
				char chr = stk.peek();
				if(chr=='(') {
					count+=2;
					stk.pop();
				}
			}

		}
		System.out.println(count);	
	}

}
