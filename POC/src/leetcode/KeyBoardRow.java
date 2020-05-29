/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212720190
 * @date Apr 1, 2020
 */
public class KeyBoardRow {

//Given a List of words, return the words that can be typed using letters of 
//alphabet on only one row's of American keyboard like the image below.
public static void main(String[] args) {
	String[] words = {"Hello","Alaska","Dad","Peace"};
	String[] keyboard = {"qwertyuiop","asdfghjkl","zxcvbnm"};

	List<String> result = new ArrayList<>();


	for(int i=0;i<words.length;i++) {
		String ss = words[i];
		ss=ss.toLowerCase();
		for(String str : keyboard) {
			int count=0;
			for(int j=0;j<ss.length();j++) {
				if(!str.contains(String.valueOf(ss.charAt(j))))
					break;
				else
					count++;
			}
			if(count==ss.length())
				result.add(ss);
		}

	}
	 String[] res=new String[result.size()];
     result.toArray(res);

}

}
