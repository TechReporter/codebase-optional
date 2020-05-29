/**
 * 
 */
package com;

/**
 * @author 212720190
 * @date Mar 28, 2019
 */
public class WildCardMatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1  = "sctr?";
		String str2  = "sco??";
		boolean flag = false;
		if(str1.length() == str2.length()) {
			for(int i = 0; i<str1.length(); i++) {
				if((str1.charAt(i) == '?') || (str1.charAt(i) == str2.charAt(i) || 
									(str2.charAt(i) == '?'))) {
					flag = true;
				}
				else {
					flag = false;
					break;
				}
			}
		}else {
			flag = false;
		}
		System.out.println(flag);
	}

}
