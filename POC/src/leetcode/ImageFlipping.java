/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212720190
 * @date Mar 10, 2020
 */
public class ImageFlipping {


	public static void main(String[] args) {
		String str = "-++++";
		List<String> result = new ArrayList<String>();
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)=='+') {
				String ss = str.substring(0, i)+"--"+str.substring(i+2, str.length());
				result.add(ss);
			}
		}
		result.forEach(System.out::println);
	}

}
