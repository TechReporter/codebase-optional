/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Apr 6, 2020
 */
public class LongPressedName {

	//925. Long Pressed Name
	public static void main(String[] args) {
		String s = "kikcxmvzi"; String typed = "kiikcxxmmvvzz";
		int i=0;
		int j=0;
		boolean flag=false;
		while(i<s.length() || j<typed.length()) {
			if(i==s.length()-1 && j==typed.length()-1 && s.charAt(i)!=typed.charAt(j)) {
			flag=true;	
			}
			if(i<s.length() && j<typed.length()) {
				if(s.charAt(i)==typed.charAt(j)) {
					i++;
					j++;
				} else {
					j++;
				}	
			}
		}
		System.out.println(flag);
		
	}

}
