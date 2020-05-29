/**
 * 
 */
package stringpractice;

import java.util.Arrays;

/**
 * @author 212720190
 * @date Mar 3, 2020
 */
public class validateIpAddr {

	public static void main(String[] args) {

		String str = "102.01.45";
		String[] ss = str.split("\\.");
		boolean bool = false;
		try {
			
		 bool = Arrays.stream(ss).filter(e-> e.length()>1)
				.map(Integer::parseInt)
				.filter(e-> (e>=0 && e<=255))
				.count()==4;
		}
		catch (NumberFormatException e) {
			
		} finally {
			System.out.println(bool);

		}
	}

}
