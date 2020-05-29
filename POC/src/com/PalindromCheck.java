/**
 * 
 */
package com;

/**
 * @author 212720190
 * @date Apr 19, 2019
 */
public class PalindromCheck {

	public static void main(String[] args) {

		String str = "nayan";
		StringBuilder sb = new StringBuilder(str);
		if(str.equals(sb.reverse().toString())) {
			System.out.println("true");
		}
	}

}
