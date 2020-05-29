package leetcode;

/**
 * @author 212720190
 * @date Mar 22, 2020
 */
public class IsSubsequence {

	public static void main(String[] args) {
		String s="aec";
		String t = "abcde";
		int p1=0;
		for(int i=0;i<t.length();i++) {
			if(s.charAt(p1)==t.charAt(i)) {
				p1++;
			}
		}
		if(p1==s.length())
			System.out.println(true);
		System.out.println(false);
		
		//another way
		int j=0;
		for(char c:s.toCharArray()) {
			int index = t.indexOf(c,j);
			if(index==-1) {
				System.out.println(false);
				break;
			}
		j=index+1;
		}
	}
}
