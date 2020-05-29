/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Mar 30, 2020
 */
public class JweelStones {

	//771 jweel and stones.
	public static void main(String[] args) {

		String j="aA";
		String s = "aAAbbbb";
		int count=0;
		for(int i=0;i<s.length();i++) {
			for(int m=0;m<j.length();m++) {
				if(s.charAt(i)==j.charAt(m))
					count++;
			}
		}
		System.out.println(count);
	}

}
