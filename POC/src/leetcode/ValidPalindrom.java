/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Mar 29, 2020
 */
public class ValidPalindrom {

	//125. Valid Palindrome
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		s=s.toLowerCase();
		s=s.replaceAll("[^A-Za-z]","");
		boolean flag=true;
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				flag=false;
				break;	
			}
			i++;
			j--;
		}
		if(!flag)
			System.out.println("not valid palindrom");
	}

}
