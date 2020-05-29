/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 212720190
 * @date Apr 4, 2020
 */
public class SubStringOfSizeKwthKdstntChar {


	public static void main(String[] args) {
		substnrgSizeK("awaglknagawunagwkwagl",3);

	}

	static List<String> substnrgSizeK(String s,int k) {
		Set<String> set = new HashSet<>();
		for(int i=0;i<s.length()-k+1;i++) {
			String ss = "";
			for(int j=i;j<i+k;j++) {
				if(ss.indexOf(s.charAt(j))!=-1) {
					break;
				} else {
					ss = ss.concat(String.valueOf(s.charAt(j)));
				}
			}
			if(ss.length()==k) {
				set.add(ss);
			}
		}
		return new ArrayList<>(set);
	}

}
