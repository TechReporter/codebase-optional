package datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212720190
 * @date May 18, 2019
 */
public class StringPermutationPalindrome {

	public static void main(String[] args) {

		String str = "mdaam";
		List<Character> char_list = new ArrayList<>();
		
		for(int i =0;i<str.length();i++) {
			if(char_list.contains(str.charAt(i))) {
				char_list.remove((Character)str.charAt(i));
			} else 
				char_list.add(str.charAt(i));
		}
		
		if((str.length() %2==0 && char_list.size()==0) ||
				str.length()%2 ==1 && char_list.size() ==1) {
			System.out.println("possible");
		} else {
			System.out.println("not possible");
		}
	}

}
