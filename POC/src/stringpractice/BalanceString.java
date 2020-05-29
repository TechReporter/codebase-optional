/**
 * 
 */
package stringpractice;

/**
 * @author 212720190
 * @date Mar 6, 2020
 */
public class BalanceString {

	
	public static void main(String[] args) {
		String str = "RLRRLLRLRL";
		int rc = 0;
		int lc = 0;
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='R') {
				rc++;
			} else {
				lc++;
			}
			if(rc==lc) {
				rc=0;
				lc=0;
				count++;
			}
		}
		System.out.println(count);
	}

}
