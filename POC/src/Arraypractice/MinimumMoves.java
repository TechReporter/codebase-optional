package Arraypractice;

import java.util.Arrays;
import java.util.List;

/**
 * @author 212720190
 * @date Mar 10, 2020
 */
public class MinimumMoves {

	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(1234,4321);
		List<Integer> arr1 = Arrays.asList(2345,3214);
		int i=0;
		int count = 0;
		while(i<arr.size()) {
			int a = arr.get(i);
			int b = arr1.get(i);
			count = tst(count, a, b);
			i++;
		}
		System.out.println(count);
	}

	private static int tst(int count, int a, int b) {
		while(a>0 && b>0) {
			int rem1 = a%10;
			int rem2 = b%10;
			a/=10;
			b/=10;
			count+=Math.abs(rem1-rem2);
		}
		return count;
	}

}
