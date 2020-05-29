package leetcode;

/**
 * @author 212720190
 * @date Mar 23, 2020
 */
public class SubArrayWithinBound {

	
	public static void main(String[] args) {
		int[] a = {2,1,4,3};
		int l=2;
		int r=3;
		int result = 0;
		Integer maxLessThanL = 0;
		Integer maxValid = 0;
		for (int i = 0; i < a.length; i++) {
		if (a[i] < l) {
		result = result + maxValid;
		maxLessThanL++;
		} else if (a[i] > r) {
		maxValid = 0;
		maxLessThanL = 0;
		} else {
		maxValid = maxValid + maxLessThanL + 1;
		result = result + maxValid;
		maxLessThanL = 0;
		}
		}
		System.out.println(result);
	}

}
