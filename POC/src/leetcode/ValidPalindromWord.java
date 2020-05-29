package leetcode;

/**
 * @author 212720190
 * @date Apr 14, 2020
 */
public class ValidPalindromWord {


	public static void main(String[] args) {

		System.out.println(validPalindrome("abc"));
	}

	public static boolean validPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right))
				return checkPalindrome(left + 1, right, s) || checkPalindrome(left, right - 1, s);
			left++;
			right--;
		}
		return true;
	}

	private static boolean checkPalindrome(int left, int right, String s) {
		while (left < right) {
			if (s.charAt(left++) != s.charAt(right--))
				return false;
		}
		return true;
	}
}
