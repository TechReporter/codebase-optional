/**
 * 
 */
package datastructure;

import java.util.ArrayList;

/**
 * @author 212720190
 * @date Dec 25, 2019
 */
public class Product {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(solution(5,6).toString());

	}

	public static String[] solution(int N, int K) {
		if (N == 0) {
			return new String[] {""};
		}
		ArrayList<String> result = new ArrayList<String>();
		for (String p : solution(N - 1, K - 1)) {
			for (char l : new char[] {'a', 'b', 'c'}) {
				int pLen = p.length();
				if (pLen == 0 || p.charAt(pLen - 1) != l) {
					result.add(p + l);
				}
			}
		}
		int prefSize = Math.min(result.size(), K);
		String[] str = new String[prefSize];
		str = result.subList(0, prefSize).toArray(new String[prefSize]);
		return str;

	}
}
