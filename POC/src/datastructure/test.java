/**
 * 
 */
package datastructure;

import java.util.Stack;

/**
 * @author 212720190
 * @date Nov 11, 2019
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "{}(";
		if(checkParanthesis(input)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }	}
	
	 static boolean checkParanthesis(String input) {
	        char[] chr = input.toCharArray();
	        Stack<Character> stk_pool = new Stack<>();
	        for(int i=0;i<=chr.length-1;i++) {
	            if(chr[i]=='(' || chr[i]=='{'||chr[i]=='[') {
	                stk_pool.push(chr[i]);
	            } else if(stk_pool.isEmpty() || chr.length%2!=0) {
	                return false;
	            } else {
	                    Character cc = stk_pool.pop();
	                    if(isMatch(chr[i],cc)) {
	                        return true;
	                    }
	            }
	        }
	        return false;
	    }

	    static boolean isMatch(char a, char b) {
	        if(a==')' && b=='(') {
	            return true;
	        }
	        if(a=='}' && b=='{') {
	            return true;
	        }
	        if(a==']' && b=='[') {
	            return true;
	        }
	        return false;
	    }

}
