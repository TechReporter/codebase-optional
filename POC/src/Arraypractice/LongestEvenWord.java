package Arraypractice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Mar 19, 2020
 */
public class LongestEvenWord {

	public static void main(String[] args) {
		String str = "Time to write great code";
		Map<String, Integer> map = new HashMap<>();
		String[] ss = str.split(" ");
		int max = Integer.MIN_VALUE;
		String res = "00";
		for(int i=ss.length-1;i>=0;i--) {
			if(ss[i].length()%2==0 && ss[i].length()>=max) {
				max = ss[i].length();
				res = ss[i];
			}
		}
System.out.println(res);
	}

}
