/**
 * 
 */
package com;

/**
 * @author 212720190
 * @date Apr 4, 2019
 */
public class FindEvenStringMaxLength {
	
	public static void main(String[] args) {

		EvenStrMaxLength("this is a tanmoy string");
	}
	public static void EvenStrMaxLength(String data) {
		String[] str = data.split(" ");
		int maxStrLnth = 0;
		int index = 0;
		for(int i = 0; i< str.length; i++) {
			if(str[i].length()%2 == 0) {
				if(maxStrLnth == 0 || maxStrLnth < str[i].length()) {
					maxStrLnth = str[i].length();
					index = i;
				}
				
			}
		}
		System.out.println("max lenghth=="+maxStrLnth);
		System.out.println(str[index]);
	}

}
