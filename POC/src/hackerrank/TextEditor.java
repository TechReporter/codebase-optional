package hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author 212720190
 * @date Apr 12, 2020
 */
public class TextEditor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Stack<String> stk = new Stack<>();
		String res = "";
		while(n!=0) {
			int choice = s.nextInt();
			if(choice==1){
				String ss = s.next();
				res = insert(res,stk,ss);
			} else if(choice==2) {
				int val = s.nextInt();
				res = delete(res, stk,val);
			} else if(choice==3) {
				int val = s.nextInt();
				print(res, stk,val);
			} else {
				res = undo(res, stk);
			}
			n--;
		}
		s.close();
	}

	static String insert(String s, Stack<String> stk, String str) {
		s=s.concat(str);
		stk.push(s);
		return s;
	}

	static String delete(String s, Stack<String> stk,int k) {
		s = s.substring(0,s.length()-k);
		stk.push(s);
		return s;
	}

	static void print(String s, Stack<String> stk,int k) {
		char chr = s.charAt(k-1); 
		System.out.println(chr);
	}

	static String undo(String s, Stack<String> stk) {
		stk.pop();
		s = stk.peek();
		return s;
	}

}
