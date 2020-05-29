/**
 * 
 */
package com;

import java.util.Optional;

/**
 * @author 212720190
 * @date Apr 15, 2019
 */
public class DefaultValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
String str = "4";
System.out.println(Optional.ofNullable(str).isPresent()?Long.valueOf(str):0);
	}

}
