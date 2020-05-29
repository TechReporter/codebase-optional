package datastructure;

import java.io.IOException;

/**
 * @author 212720190
 * @date Jun 7, 2019
 */
public class LongestCommonSuffix {

	//get longest common suffix from two string
	public static void main(String[] args) throws IOException {
		String[] str = {"cornfield","outfield"};
		String minStr = null;
		int i=0;
		if(str[0].length()>str[1].length()) {
			minStr = str[1];
		} else {
			minStr = str[0];
		}

		while(i<minStr.length()) {
			if(str[0].charAt(str[0].length()-1-i)==str[1].charAt(str[1].length()-1-i)) {
				i++;
			} else {
				break;
			}
		}
		if(i>0) {
			minStr=minStr.substring(minStr.length()-i, minStr.length());
			System.out.println(minStr);
		} else {
			System.out.println("NULL");
		}
	}
}
