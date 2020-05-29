package datastructure;

/**
 * @author 212720190
 * @date Nov 8, 2019
 */
public class LongestBalanceParenthesis {

	public static void main(String[] args) {

		String str = "()(()))())";
		int maxL = 0;
		int pointer = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(')
				pointer+=-1;
			if(str.charAt(i)==')')
				pointer+=1;
			if(pointer==0)
				maxL=i;
		}
		System.out.println(maxL+1);
	}

}
