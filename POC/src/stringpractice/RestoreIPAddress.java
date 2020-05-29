/**
 * 
 */
package stringpractice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212720190
 * @date Mar 23, 2020
 */
public class RestoreIPAddress {


	public static void main(String[] args) {
		String s = "25525511135";
		List<String> list = new ArrayList<>();
		for(int i=0;i<=3 && i<s.length();i++) {
			String p1 = s.substring(0, i);
			if(!isValid(p1))
				continue;
			for(int j=i;i<=i+3 && j<s.length();j++) {
				String p2=s.substring(i,j);
				if(!isValid(p2))
					continue;
				for(int k=j;k<=j+3 && j<s.length();k++) {
					String p3=s.substring(j,k);
					if(!isValid(p3))
						continue;
					String p4=s.substring(k);
					if(!isValid(p4))
						continue;

					StringBuilder sb = new StringBuilder();
					sb.append(p1);
					sb.append(".");
					sb.append(p2);
					sb.append(".");
					sb.append(p3);
					sb.append(".");
					sb.append(p4);

					list.add(sb.toString());
				}
			}

		}
	}

	static boolean isValid(String s) {

		return s.length() > 0 && !(s.length() > 1 && s.startsWith("0")) && !(s.length() > 3) && Integer.valueOf(s) <= 255;

	}

}
