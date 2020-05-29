package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllValidParenthesis {

	public static void main(String[] args) {
		List<String> result = new ArrayList<>();
		int n=2;
		generateParenthesis(result, 0, 0, n, "");
		result.forEach(System.out::println);
	}
	static void generateParenthesis(List<String> list, int open,int close,int len,String curr) {
		if(curr.length()==len*2 && open==len && close==len) {
			list.add(curr);
		}
		if(open>len || close>len || close>open)
			return;
		generateParenthesis(list, open+1, close, len, curr.concat("("));
		generateParenthesis(list, open, close+1, len, curr.concat(")"));

	}

}
