/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 7, 2020
 */
public class LongestValidParanthesis {

	// posssible longest valid paranthesis. () is valid with 2 size.
	//(())()( valid with size 6
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = ")()))(())((())))))())()(((((())())((()())(())((((())))())((()()))(()(((()()(()((()()))(())()))(((";
		char[] chr = str.toCharArray();
		int openClose=0;
		int count=0;
		for(int i=0;i<chr.length;i++) {
			if(chr[i]=='(')
				openClose++;
			else if(chr[i]==')' && openClose==0) {
				continue;
			} else if(chr[i]==')' && openClose>0) {
				count+=2;
				openClose--;
			}
		}

		System.out.println(count);
	}

}
