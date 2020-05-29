package stringpractice;

/**
 * @author 212720190
 * @date Feb 13, 2020
 */
public class ReverseString {

	
	public static void main(String[] args) {

		String s ="Let's take LeetCode contest";
		String result = "";
		String[] str = s.split(" ");
		for(int i=0; i<str.length;i++) {
			StringBuilder strb = new StringBuilder(str[i]);
			result+=strb.reverse().toString().concat(" ");
		}
		System.out.println(result.trim());
	}

}
