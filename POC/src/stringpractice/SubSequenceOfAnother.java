/**
 * 
 */
package stringpractice;

/**
 * @author 212720190
 * @date Mar 15, 2020
 */
public class SubSequenceOfAnother {

	//whether string contain all character with maintained order 
	public static void main(String[] args) {
		String str1 = "rspu";
		String str2 = "pqrsptyuarspu";

		int p1=0;
		int p2=0;
		while(p1<str1.length() && p2<str2.length()) {
			if(str1.charAt(p1)==str2.charAt(p2)) {
				p1++;
				p2++;
			}
			else {
				p2++;
				p1=0;
			}
		}
		if(p1==str1.length()) {
			System.out.println("yes");
		} else {
			System.out.println("false");
		}

	}

}
