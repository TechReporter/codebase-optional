package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Jan 13, 2020
 */
public class RansomNote {

	public static void main(String[] args) {

		System.out.println(canConstruct("a", "b"));
	}
	
	public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
               
        if(ransomNote.isEmpty() && magazine.isEmpty()) {
            return true;
        }
        char[] chr = magazine.toCharArray();
        for(int i=0;i<chr.length;i++) {
            if(map.containsKey(chr[i])) {
                map.put(chr[i],map.get(chr[i])+1);
            } else {
                    map.put(chr[i],1);
            }
        }
            for(int j=0;j<ransomNote.toCharArray().length;j++) {
                if(!map.containsKey(ransomNote.toCharArray()[j]) ||
                  map.get(ransomNote.toCharArray()[j])<=0) {
                    return false;
                }
                map.put(ransomNote.toCharArray()[j],map.get(ransomNote.toCharArray()[j])-1);
            }
        return true;
    }

}
