/**
 * 
 */
package leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author 212720190
 * @date Apr 2, 2020
 */
public class BalanceCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] values = {"[{()()}({[]})]({}[({})])((((((()[])){}))[]{{{({({({{{{{{}}}}}})})})}}}))[][][]{"};
		braces(values);

	}
	
	 static String[] braces(String[] values) {
	        String[] res = new String[values.length];
	        Arrays.fill(res, "YES");
	        for(int i=0;i<values.length;i++) {
	            String s = values[i];
	            Stack<Character> stk = new Stack<>();
	            for(int j=0;j<s.length();j++) {
	                if(stk.isEmpty() && (s.charAt(j)==']' || s.charAt(j)=='}'
	            || s.charAt(j)==')')) {
	                res[i]="NO";
	                break;
	            } else if(s.charAt(j)=='(' || s.charAt(j)=='{'
	            || s.charAt(j)=='[') {
	                stk.push(s.charAt(j));
	            } else if((s.charAt(j)==']' && stk.pop()!='[') ||
	             (s.charAt(j)=='}'  && stk.pop()!='{')
	            || (s.charAt(j)==')'  && stk.pop()!='(')) {
	                res[i]="NO";
	                break;
	            }
	            }
	            if(!stk.isEmpty())
	            	 res[i]="NO";
	        }
	    return res;
	    }

}
