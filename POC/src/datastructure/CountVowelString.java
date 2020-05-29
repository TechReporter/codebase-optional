package datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Jul 6, 2019
 */
public class CountVowelString {

	public static void main(String[] args) {
		String str = "dbacd";
		Map<Integer, String> map = new HashMap<Integer, String>();
		for(int i=0;i<str.length();i++) {
			map.put(i, str.substring(i, str.length()));
		}
        int finalCount = 0;

		for(String s : map.values()){
			int countA = 0;
			int countB = 0;
			int countC = 0;

			for(int i=0;i<=s.length()-1;i++){
				if(s.charAt(i) == 'a'){
					countA = countA + 1;
				}
				if(s.charAt(i) == 'b'){
					countB = countB + 1;
				}
				if(s.charAt(i) == 'c'){
					countC = countC + 1;
				}
				
				if((countA == countB) && (countB == countC) && (countC == countA)){
					finalCount = finalCount + 1;
				}
			}
		}
		System.out.println(finalCount);
	}

}
